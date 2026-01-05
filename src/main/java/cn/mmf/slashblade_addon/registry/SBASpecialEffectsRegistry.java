package cn.mmf.slashblade_addon.registry;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.specialeffect.BurstDrive;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import cn.mmf.slashblade_addon.specialeffect.SparkGreen;
import net.minecraft.core.Registry;

public class SBASpecialEffectsRegistry {
    public static void init() {

    }

    public static final SpecialEffect BURST_DRIVE = register("burst_drive", new BurstDrive());
    public static final SpecialEffect SPARK_GREEN = register("spark_green", new SparkGreen());

    private static SpecialEffect register(String name, SpecialEffect specialEffect) {
        return Registry.register(SpecialEffectsRegistry.SPECIAL_EFFECT, SlashBladeAddon.prefix(name), specialEffect);
    }
}
