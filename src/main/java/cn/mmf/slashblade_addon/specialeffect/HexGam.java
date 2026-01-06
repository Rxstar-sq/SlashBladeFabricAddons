package cn.mmf.slashblade_addon.specialeffect;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.registry.SBASpecialEffectsRegistry;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;


public class HexGam extends SpecialEffect {

    public HexGam() {
        super(30);
    }

    public static void onSlashBladeUpdate(SlashBladeEvent.UpdateEvent event) {
        ISlashBladeState state = event.getSlashBladeState();
        if(state.hasSpecialEffect(SlashBladeAddon.prefix("hexgam_fox")) || 
           state.hasSpecialEffect(SlashBladeAddon.prefix("hexgam_dragon"))) {
            if (!(event.getEntity() instanceof Player)) {
                return;
            }

            if(!event.isSelected())
                return;

            Player player = (Player) event.getEntity();

            int level = player.experienceLevel;
            if (!player.hasEffect(MobEffects.ABSORPTION)){
                if(SpecialEffect.isEffective(SBASpecialEffectsRegistry.HEXGAM_FOX, level) || 
                   SpecialEffect.isEffective(SBASpecialEffectsRegistry.HEXGAM_DRAGON, level)){
                    player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 300, 4));
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 2));
                    player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 1));
                }
            }
        }
    }
}