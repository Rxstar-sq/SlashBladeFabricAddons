package cn.mmf.slashblade_addon.specialeffect;

import cn.mmf.slashblade_addon.registry.SBASpecialEffectsRegistry;
import mods.flammpfeil.slashblade.capability.slashblade.CapabilitySlashBlade;
import mods.flammpfeil.slashblade.capability.slashblade.ISlashBladeState;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;

public class SparkGreen extends SpecialEffect {

    public SparkGreen() {
        super(10, true, true);
    }

    public static void onSlashBladeUpdate(SlashBladeEvent.UpdateEvent event) {
        if (!(event.getEntity() instanceof Player player)) return;
        if (!event.isSelected()) return;

        ISlashBladeState mainState = event.getSlashBladeState();
        
        /* //调试信息
        if (player.tickCount % 100 == 0) { 
            System.out.println("=== SparkGreen 调试 ===");
            System.out.println("刀上的状态: " + mainState);
            System.out.println("刀上的所有 SE: " + mainState.getSpecialEffects());
            System.out.println("SPARK_GREEN 的键: " + SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SBASpecialEffectsRegistry.SPARK_GREEN));
            System.out.println("玩家等级: " + player.experienceLevel);
            System.out.println("是否有 SPARK_GREEN: " + hasSparkGreen(mainState));
        }
            */

        ISlashBladeState offhandState = CapabilitySlashBlade.getBladeState(player.getOffhandItem()).orElse(null);

        if (hasSparkGreen(mainState) || hasSparkGreen(offhandState)) {
            applyIfReady(player);
        }
    }

    private static boolean hasSparkGreen(ISlashBladeState state) {
        return state != null && state.hasSpecialEffect(SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SBASpecialEffectsRegistry.SPARK_GREEN));
    }

    private static void applyIfReady(Player player) {
        if (player.hasEffect(MobEffects.REGENERATION)) return;
        if (SpecialEffect.isEffective(SBASpecialEffectsRegistry.SPARK_GREEN, player.experienceLevel)) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 2, false, false, true));
        } 
    }
}