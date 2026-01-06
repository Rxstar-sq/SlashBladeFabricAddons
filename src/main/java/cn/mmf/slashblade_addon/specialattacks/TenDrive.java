package cn.mmf.slashblade_addon.specialattacks;

import mods.flammpfeil.slashblade.capability.slashblade.CapabilitySlashBlade;
import mods.flammpfeil.slashblade.slasharts.Drive;
import mods.flammpfeil.slashblade.util.AttackManager;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class TenDrive {
    public static void doSlash(LivingEntity playerIn, float roll, int lifetime, Vec3 centerOffset,
                               boolean critical, double damage, float minSpeed, float maxSpeed, int count) {
        int colorCode = CapabilitySlashBlade.getBladeState(playerIn.getMainHandItem())
                .map(state -> state.getColorCode()).orElse(0xFF3333FF);

        AttackManager.doSlash(playerIn, 0.0f, Vec3.ZERO, false, false, 2F);
        AttackManager.doSlash(playerIn, -90F, Vec3.ZERO, false, false, 2F);
        
        // Fabric版Drive.doSlash参数: (entity, roll, yRot, lifetime, colorCode, offset, critical, damage, knockback, speed)
        Drive.doSlash(playerIn, roll, 0F, lifetime, colorCode, centerOffset, critical, damage, null, minSpeed);
        Drive.doSlash(playerIn, roll - 90F, 0F, lifetime, colorCode, centerOffset, critical, damage, null, minSpeed);
    }
}