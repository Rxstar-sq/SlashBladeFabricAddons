package cn.mmf.slashblade_addon.specialattacks;

import mods.flammpfeil.slashblade.capability.concentrationrank.CapabilityConcentrationRank;
import mods.flammpfeil.slashblade.capability.slashblade.CapabilitySlashBlade;
import mods.flammpfeil.slashblade.slasharts.Drive;
import mods.flammpfeil.slashblade.util.KnockBacks;
import mods.flammpfeil.slashblade.util.VectorHelper;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class FoxJustice {
    public static void doSlash(LivingEntity playerIn, int count) {
        int colorCode = CapabilitySlashBlade.getBladeState(playerIn.getMainHandItem())
                .map(state -> state.getColorCode()).orElse(0xFF3333FF);
        doSlash(playerIn, colorCode, count);
    }

    public static void doSlash(LivingEntity playerIn, int colorCode, int count) {
        if (playerIn.level().isClientSide()) return;

        Level worldIn = playerIn.level();
        RandomSource random = worldIn.getRandom();

        for (int i = 0; i < count; i++) {
            // 为每个斩击设置不同的延迟和角度
            float roll = playerIn.getYRot() + (i * 360f / count) + random.nextFloat() * 20 - 10;
            
            // 随机偏移位置
            double xOffset = (random.nextDouble() - 0.5) * 14;
            double zOffset = (random.nextDouble() - 0.5) * 10;
            double yOffset = (random.nextDouble() - 0.5) * 6;
            
            Vec3 offset = new Vec3(xOffset, yOffset, zOffset);
            
            // 使用 Drive.doSlash 而不是简单的 EntitySlashEffect
            // 这会自动创建带有动画的 EntityDrive
            Drive.doSlash(playerIn, roll, 0F, 12, colorCode, offset, false, 1.5, null, 1.5f);
            playerIn.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT, 0.2F, 1.45F);
        }
    }
}