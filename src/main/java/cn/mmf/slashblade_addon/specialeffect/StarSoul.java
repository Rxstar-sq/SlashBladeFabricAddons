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
        // 主手检查
        checkAndApplyEffect(event.getSlashBladeState(), event);

        // 副手检查
        if(event.getEntity() instanceof Player player) {
            ItemStack offhandItem = player.getOffhandItem();
            if (offhandItem.getItem() instanceof ItemSlashBlade) {
                CapabilitySlashBlade.getBladeState(offhandItem).ifPresent(offhandState -> {
                    checkAndApplyEffect(offhandState, event);
                });
            }
        }
    }

    private static void checkAndApplyEffect(ISlashBladeState state, SlashBladeEvent.UpdateEvent event) {
        if(state.hasSpecialEffect(SlashBladeAddon.prefix("star_soul"))) {
            if (!(event.getEntity() instanceof Player player)) return;
            if (!(player.getMainHandItem().getItem() instanceof ItemSlashBlade))return;
            if(!event.isSelected()) return;

            Level inlevel = player.level();
            int level = player.experienceLevel;
            if (inlevel.isNight() && SpecialEffect.isEffective(SBASpecialEffectsRegistry.STAR_SOUL, level)){
                if (state.getDamage()>-state.getMaxDamage()){
                    state.setDamage(state.getDamage()-1);
                }
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 1));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 1));
            }
        }
    }

}