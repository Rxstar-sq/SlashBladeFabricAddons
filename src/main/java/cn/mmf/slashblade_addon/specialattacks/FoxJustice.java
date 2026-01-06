package cn.mmf.slashblade_addon.specialattacks;

import mods.flammpfeil.slashblade.capability.slashblade.CapabilitySlashBlade;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;

public class FoxJustice {
    public static void doSlash(LivingEntity playerIn, int count) {
        int colorCode = CapabilitySlashBlade.getBladeState(playerIn.getMainHandItem())
                .map(state -> state.getColorCode()).orElse(0xFF3333FF);
        doSlash(playerIn, colorCode, count);
    }

    public static void doSlash(LivingEntity playerIn, int colorCode, int count) {
        if (playerIn.level().isClientSide()) return;

        CapabilitySlashBlade.getBladeState(playerIn.getMainHandItem()).ifPresent((state) -> {
            for (int i = 0; i < count; i++) {
                // 简化版：直接播放音效
                playerIn.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT, 0.2F, 1.45F);
            }
        });
    }
}