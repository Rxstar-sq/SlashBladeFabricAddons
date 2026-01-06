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

public class Eternal extends SpecialEffect {
    public Eternal() {
        super(20);
    }

    public static void onSlashBladeUpdate(SlashBladeEvent.UpdateEvent event) {
        if (!(event.getEntity() instanceof Player player)) return;

        // 主手检查
        checkAndApplyEffect(event.getSlashBladeState(), player, event);

        // 副手检查
        ItemStack offhandItem = player.getOffhandItem();
        if (offhandItem.getItem() instanceof ItemSlashBlade) {
            CapabilitySlashBlade.getBladeState(offhandItem).ifPresent(offhandState -> {
                checkAndApplyEffect(offhandState, player, event);
            });
        }
    }

    private static void checkAndApplyEffect(ISlashBladeState state, Player player, SlashBladeEvent.UpdateEvent event) {
        if (state.hasSpecialEffect(SlashBladeAddon.prefix("sword_art_on_fox"))) {
            if(!event.isSelected())
                return;
            int level = player.experienceLevel;
            if (SpecialEffect.isEffective(SBASpecialEffectsRegistry.SWORD_ART_ON_FOX, level)) {
                player.addEffect(new MobEffectInstance(MobEffects.LUCK, 100, 1));
            }
        }
    }
}