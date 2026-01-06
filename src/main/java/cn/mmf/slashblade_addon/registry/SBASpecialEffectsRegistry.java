package cn.mmf.slashblade_addon.registry;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.specialeffect.*;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import mods.flammpfeil.slashblade.registry.specialeffects.SpecialEffect;
import net.minecraft.core.Registry;

public class SBASpecialEffectsRegistry {
    public static void init() {

    }

    public static final SpecialEffect BURST_DRIVE = register("burst_drive", new BurstDrive());
    public static final SpecialEffect SPARK_GREEN = register("spark_green", new SparkGreen());
    public static final SpecialEffect STAR_SOUL = register("star_soul", new StarSoul());
    public static final SpecialEffect EX_MODE = register("ex_mode", new ExMode());
    public static final SpecialEffect HEXGAM_FOX = register("hexgam_fox", new HexGam());
    public static final SpecialEffect HEXGAM_DRAGON = register("hexgam_dragon", new HexGam());
    public static final SpecialEffect SWORD_ART_ON_FOX = register("sword_art_on_fox", new Eternal());

    private static SpecialEffect register(String name, SpecialEffect specialEffect) {
        return Registry.register(SpecialEffectsRegistry.SPECIAL_EFFECT, SlashBladeAddon.prefix(name), specialEffect);
    }
}
