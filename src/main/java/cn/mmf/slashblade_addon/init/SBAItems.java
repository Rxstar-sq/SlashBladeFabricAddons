package cn.mmf.slashblade_addon.init;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.item.ItemTierSlashBlade;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class SBAItems {
    public static void init() {
        // All items are registered in static initializers
    }

    // Addon Blades - Each gets a unique Item
    public static final Item SLASHBLADE_MURAKUMO = register("slashblade_murakumo", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_HF_MURASAMA = register("slashblade_hf_murasama", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_WANDERER = register("slashblade_wanderer", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_WANDERER_HF = register("slashblade_wanderer_hf", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Kamuy series
    public static final Item SLASHBLADE_KAMUY_NONE = register("slashblade_kamuy_none", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_KAMUY_WATER = register("slashblade_kamuy_water", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_KAMUY_FIRE = register("slashblade_kamuy_fire", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_KAMUY_LIGHTNING = register("slashblade_kamuy_lightning", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Terra Blade
    public static final Item SLASHBLADE_TERRA_BLADE = register("slashblade_terra_blade", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Kirisaya
    public static final Item SLASHBLADE_KIRISAYA = register("slashblade_kirisaya", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Laemmle
    public static final Item SLASHBLADE_LAEMMLE = register("slashblade_laemmle", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Yukari
    public static final Item SLASHBLADE_YUKARI = register("slashblade_yukari", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Tboen
    public static final Item SLASHBLADE_TBOEN = register("slashblade_tboen", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Toyako
    public static final Item SLASHBLADE_TOYAKO = register("slashblade_toyako", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Nihil series
    public static final Item SLASHBLADE_NIHIL = register("slashblade_nihil", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_NIHILEX = register("slashblade_nihilex", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_NIHILUL = register("slashblade_nihilul", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_CRIMSONCHERRY = register("slashblade_crimsoncherry", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_NIHILBX = register("slashblade_nihilbx", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // WA series
    public static final Item SLASHBLADE_KATANA = register("slashblade_katana", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_TACHI = register("slashblade_tachi", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_BLUE = register("slashblade_blue", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // BladeMaster series
    public static final Item SLASHBLADE_GREEN_MIST = register("slashblade_green_mist", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_AQUABLAZE = register("slashblade_aquablaze", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_MOONLIGHT_CHERRY = register("slashblade_moonlight_cherry", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Dark Raven series
    public static final Item SLASHBLADE_DARK_RAVEN = register("slashblade_dark_raven", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_SNOW_CROW = register("slashblade_snow_crow", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Fluorescent Bar
    public static final Item SLASHBLADE_FLUORESCENT_BAR = register("slashblade_fluorescent_bar", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    // Frost Wolf series
    public static final Item SLASHBLADE_FROSTY_CHERRY = register("slashblade_frosty_cherry", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_FROST_WOLF = register("slashblade_frost_wolf", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

    private static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, SlashBladeAddon.prefix(name), item);
    }
}
