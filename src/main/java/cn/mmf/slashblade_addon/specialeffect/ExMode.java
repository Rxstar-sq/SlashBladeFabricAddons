package cn.mmf.slashblade_addon.specialeffect;

import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import mods.flammpfeil.slashblade.slasharts.SakuraEnd;
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
                                        SakuraEnd.doSlash(player, event.getRoll(), Vec3.ZERO, false, false, event.getDamage()/2);
                                    }
                                ));
                            }
                        }
                    }
                }
            }
        }
    }

    public int returnCount(){
        return 3;
    }
}