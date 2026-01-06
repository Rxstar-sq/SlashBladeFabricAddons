package cn.mmf.slashblade_addon.specialeffect;

import mods.flammpfeil.slashblade.capability.concentrationrank.CapabilityConcentrationRank;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.entity.EntitySlashEffect;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.init.SBEntityTypes;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import mods.flammpfeil.slashblade.util.KnockBacks;
import mods.flammpfeil.slashblade.util.VectorHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class ExMode extends SpecialEffect {
    public ExMode() {
        super(60);
    }

    public static void doSlash(SlashBladeEvent.DoSlashEvent event){
        ISlashBladeState state = event.getSlashBladeState();
        if(state == null) return;
        
        List<ResourceLocation> effects = state.getSpecialEffects();

        for (ResourceLocation effectId : effects) {
            SpecialEffect effect = SpecialEffectsRegistry.SPECIAL_EFFECT.get(effectId);
            if (effect instanceof ExMode && event.getUser() instanceof Player player) {
                if (state.hasSpecialEffect(effectId)){
                    if (SpecialEffect.isEffective(effect, player.experienceLevel)){
                        ExMode exMode = (ExMode) effect;
                        // 在服务端执行延迟斩击
                        if(player.level() instanceof ServerLevel serverLevel) {
                            for (int i = 0; i < exMode.returnCount(); i++){
                                int delay = (i + 1) * 4; // 每次延迟4 ticks
                                serverLevel.getServer().tell(new net.minecraft.server.TickTask(
                                    serverLevel.getServer().getTickCount() + delay,
                                    () -> {
                                        // 直接生成斩击实体，不触发事件
                                        createSlashEffect(player, event.getRoll(), Vec3.ZERO, false, false, event.getDamage()/2, event.getSlashBladeState().getColorCode());
                                    }
                                ));
                            }
                        }
                    }
                }
            }
        }
    }

    // 直接创建斩击实体的方法（不触发事件）
    private static EntitySlashEffect createSlashEffect(Player player, float roll, Vec3 centerOffset, boolean mute, boolean critical, double damage, int colorCode) {
        if (player.level().isClientSide()) return null;

        Vec3 pos = player.position().add(0.0F, player.getEyeHeight() * 0.75F, 0.0F)
                .add(player.getLookAngle().scale(0.3F));
        pos = pos.add(VectorHelper.getVectorForRotation(-90.0F, player.getViewYRot(0.0F)).scale(centerOffset.y))
                .add(VectorHelper.getVectorForRotation(0.0F, player.getViewYRot(0.0F) + 90.0F).scale(centerOffset.z))
                .add(player.getLookAngle().scale(centerOffset.z));

        EntitySlashEffect slash = new EntitySlashEffect(SBEntityTypes.SLASH_EFFECT, player.level());
        slash.setPos(pos.x, pos.y, pos.z);
        slash.setOwner(player);
        slash.setRotationRoll(roll);
        slash.setYRot(player.getYRot());
        slash.setXRot(0.0F);
        slash.setColor(colorCode);
        slash.setMute(mute);
        slash.setIsCritical(critical);
        slash.setDamage(damage);
        slash.setKnockBack(KnockBacks.cancel);

        // Fabric 版本的集中力等级获取
        CapabilityConcentrationRank.RANK_POINT.maybeGet(player).ifPresent(rank -> 
            slash.setRank(rank.getRank(player.level().getGameTime()).level)
        );

        player.level().addFreshEntity(slash);
        return slash;
    }

    public int returnCount(){
        return 3;
    }
}