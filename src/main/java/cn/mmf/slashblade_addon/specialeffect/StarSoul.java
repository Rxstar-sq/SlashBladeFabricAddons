package cn.mmf.slashblade_addon.specialeffect;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.registry.SBASpecialEffectsRegistry;
import mods.flammpfeil.slashblade.capability.slashblade.CapabilitySlashBlade;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class StarSoul extends SpecialEffect {
    public StarSoul() {
        super(10, false, false);
    }


    public static void onSlashBladeUpdate(SlashBladeEvent.UpdateEvent event) {
        if (!(event.getEntity() instanceof Player player)) return;
        if (!event.isSelected()) return;

        // 主手检查
        ISlashBladeState mainState = event.getSlashBladeState();
        
        // 副手检查
        ItemStack offhandItem = player.getOffhandItem();
        ISlashBladeState offhandState = null;
        if (offhandItem.getItem() instanceof ItemSlashBlade) {
            offhandState = CapabilitySlashBlade.getBladeState(offhandItem).orElse(null);
        }

        if (hasStarSoul(mainState) || hasStarSoul(offhandState)) {
            applyNightBuffs(player);
        }
    }

    private static boolean hasStarSoul(ISlashBladeState state) {
        return state != null && state.hasSpecialEffect(SlashBladeAddon.prefix("star_soul"));
    }

    private static void applyNightBuffs(Player player) {
        Level level = player.level();
        
        // 只在夜晚生效
        if (!level.isNight()) return;
        
        // 检查经验等级
        if (!SpecialEffect.isEffective(SBASpecialEffectsRegistry.STAR_SOUL, player.experienceLevel)) return;

        // 如果玩家已有效果，不重复给予（等效果快消失时自动刷新）
        if (player.hasEffect(MobEffects.DAMAGE_BOOST) && player.hasEffect(MobEffects.MOVEMENT_SPEED)) return;

        // 给予 5 秒（100 ticks）的效果
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1, false, false, true));
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1, false, false, true));
    }
}