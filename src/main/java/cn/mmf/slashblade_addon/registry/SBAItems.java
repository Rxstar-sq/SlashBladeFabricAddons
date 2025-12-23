package cn.mmf.slashblade_addon.registry;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.item.ItemTierSlashBlade;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Registry;

/**
 * 附属模组刀的Item注册类
 * 为每把刀注册独立的Item ID
 */
public class SBAItems {
    
    // slashblade_addon
    public static final Item SLASHBLADE_ADDON_AQUABLAZE = register("slashblade_addon/aquablaze", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_BLUE = register("slashblade_addon/blue", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_CRIMSONCHERRY = register("slashblade_addon/crimsoncherry", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_DARK_RAVEN = register("slashblade_addon/dark_raven", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_FLUORESCENT_BAR = register("slashblade_addon/fluorescent_bar", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_FROSTY_CHERRY = register("slashblade_addon/frosty_cherry", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_FROST_WOLF = register("slashblade_addon/frost_wolf", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_GREEN_MIST = register("slashblade_addon/green_mist", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_HF_MURASAMA = register("slashblade_addon/hf_murasama", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_FIRE = register("slashblade_addon/kamuy_fire", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_LIGHTNING = register("slashblade_addon/kamuy_lightning", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_NONE = register("slashblade_addon/kamuy_none", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_WATER = register("slashblade_addon/kamuy_water", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KATANA = register("slashblade_addon/katana", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KIRISAYA = register("slashblade_addon/kirisaya", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_LAEMMLE = register("slashblade_addon/laemmle", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_MOONLIGHT_CHERRY = register("slashblade_addon/moonlight_cherry", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_MURAKUMO = register("slashblade_addon/murakumo", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHIL = register("slashblade_addon/nihil", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHILBX = register("slashblade_addon/nihilbx", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHILEX = register("slashblade_addon/nihilex", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHILUL = register("slashblade_addon/nihilul", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_SNOW_CROW = register("slashblade_addon/snow_crow", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TACHI = register("slashblade_addon/tachi", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TBOEN = register("slashblade_addon/tboen", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TERRA_BLADE = register("slashblade_addon/terra_blade", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TOYAKO = register("slashblade_addon/toyako", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_WANDERER = register("slashblade_addon/wanderer", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_WANDERER_HF = register("slashblade_addon/wanderer_hf", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    
    // ciallo 刀
    public static final Item SLASHBLADE_ADDON_CIALLO = register("slashblade_addon/ciallo", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    
    public static void init() {
        // 注册初始化，此类加载时会执行静态初始化块
    }
    
    /**
     * 根据刀的名称获取对应的物品 Item
     * 如果找不到，返回null
     */
    public static Item getNamedBladeItem(String bladeName) {
        return switch (bladeName) {
            case "aquablaze" -> SLASHBLADE_ADDON_AQUABLAZE;
            case "blue" -> SLASHBLADE_ADDON_BLUE;
            case "crimsoncherry" -> SLASHBLADE_ADDON_CRIMSONCHERRY;
            case "dark_raven" -> SLASHBLADE_ADDON_DARK_RAVEN;
            case "fluorescent_bar" -> SLASHBLADE_ADDON_FLUORESCENT_BAR;
            case "frosty_cherry" -> SLASHBLADE_ADDON_FROSTY_CHERRY;
            case "frost_wolf" -> SLASHBLADE_ADDON_FROST_WOLF;
            case "green_mist" -> SLASHBLADE_ADDON_GREEN_MIST;
            case "hf_murasama" -> SLASHBLADE_ADDON_HF_MURASAMA;
            case "kamuy_fire" -> SLASHBLADE_ADDON_KAMUY_FIRE;
            case "kamuy_lightning" -> SLASHBLADE_ADDON_KAMUY_LIGHTNING;
            case "kamuy_none" -> SLASHBLADE_ADDON_KAMUY_NONE;
            case "kamuy_water" -> SLASHBLADE_ADDON_KAMUY_WATER;
            case "katana" -> SLASHBLADE_ADDON_KATANA;
            case "kirisaya" -> SLASHBLADE_ADDON_KIRISAYA;
            case "laemmle" -> SLASHBLADE_ADDON_LAEMMLE;
            case "moonlight_cherry" -> SLASHBLADE_ADDON_MOONLIGHT_CHERRY;
            case "murakumo" -> SLASHBLADE_ADDON_MURAKUMO;
            case "nihil" -> SLASHBLADE_ADDON_NIHIL;
            case "nihilbx" -> SLASHBLADE_ADDON_NIHILBX;
            case "nihilex" -> SLASHBLADE_ADDON_NIHILEX;
            case "nihilul" -> SLASHBLADE_ADDON_NIHILUL;
            case "snow_crow" -> SLASHBLADE_ADDON_SNOW_CROW;
            case "tachi" -> SLASHBLADE_ADDON_TACHI;
            case "tboen" -> SLASHBLADE_ADDON_TBOEN;
            case "terra_blade" -> SLASHBLADE_ADDON_TERRA_BLADE;
            case "toyako" -> SLASHBLADE_ADDON_TOYAKO;
            case "wanderer" -> SLASHBLADE_ADDON_WANDERER;
            case "wanderer_hf" -> SLASHBLADE_ADDON_WANDERER_HF;
            case "ciallo" -> SLASHBLADE_ADDON_CIALLO;
            default -> null;
        };
    }
    
    private static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, SlashBladeAddon.prefix(name), item);
    }
}
