package cn.mmf.slashblade_addon.specialattacks;

import mods.flammpfeil.slashblade.capability.slashblade.CapabilitySlashBlade;
import mods.flammpfeil.slashblade.entity.EntitySlashEffect;
import mods.flammpfeil.slashblade.init.SBEntityTypes;
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
            // 延迟生成每个斩击
            int delay = 10 + i * 2;
            
            // 随机选择左右
            boolean isRight = i % 2 == 0;
            
            // 随机偏移
            double xOffset = random.nextDouble() * 7 * (isRight ? 1 : -1);
            double zOffset = random.nextDouble() * 5;
            double yOffset = random.nextDouble() * 3;
            
            Vec3 spawnPos = playerIn.position().add(xOffset, yOffset, zOffset);
            
            // 创建斩击特效
            EntitySlashEffect slash = new EntitySlashEffect(SBEntityTypes.SLASH_EFFECT, worldIn);
            slash.setPos(spawnPos.x, spawnPos.y, spawnPos.z);
            slash.setOwner(playerIn);
            slash.setRotationRoll(random.nextFloat() * 360);
            slash.setYRot(playerIn.getYRot() + (isRight ? 45 : -45));
            slash.setXRot(0);
            slash.setColor(colorCode);
            slash.setMute(false);
            slash.setIsCritical(false);
            slash.setDamage(5);
            slash.setKnockBack(KnockBacks.cancel);
            
            worldIn.addFreshEntity(slash);
            playerIn.playSound(SoundEvents.CHORUS_FRUIT_TELEPORT, 0.2F, 1.45F);
        }
    }
}