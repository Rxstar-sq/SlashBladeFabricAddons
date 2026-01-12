package cn.mmf.slashblade_addon.registry;

import cn.mmf.slashblade_addon.SlashBladeAddon;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import mods.flammpfeil.slashblade.item.ItemTierSlashBlade;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

/**
 * 附属模组刀的Item注册类
 * 为每把刀注册独立的Item ID
 */
public class SBAItems {
    
    // slashblade_addon
    public static final Item SLASHBLADE_ADDON_AQUABLAZE = register("aquablaze", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_BLUE = register("blue", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_CRIMSONCHERRY = register("crimsoncherry", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_DARK_RAVEN = register("dark_raven", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_FLUORESCENT_BAR = register("fluorescent_bar", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_FROSTY_CHERRY = register("frosty_cherry", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_FROST_WOLF = register("frost_wolf", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_GREEN_MIST = register("green_mist", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_HF_MURASAMA = register("hf_murasama", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_FIRE = register("kamuy_fire", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_LIGHTNING = register("kamuy_lightning", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_NONE = register("kamuy_none", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KAMUY_WATER = register("kamuy_water", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KATANA = register("katana", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_KIRISAYA = register("kirisaya", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_LAEMMLE = register("laemmle", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_MOONLIGHT_CHERRY = register("moonlight_cherry", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_MURAKUMO = register("murakumo", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHIL = register("nihil", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHILBX = register("nihilbx", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHILEX = register("nihilex", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_NIHILUL = register("nihilul", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_SNOW_CROW = register("snow_crow", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TACHI = register("tachi", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TBOEN = register("tboen", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TERRA_BLADE = register("terra_blade", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_TOYAKO = register("toyako", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_WANDERER = register("wanderer", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_WANDERER_HF = register("wanderer_hf", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    public static final Item SLASHBLADE_ADDON_YUKARI = register("yukari", 
            new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    
        // ciallo 刀
        public static final Item SLASHBLADE_ADDON_CIALLO = register("ciallo",
                        new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));

        // yakumoblade 全量独立物品（静态注册）
        public static final Item SLASHBLADE_ADDON_BLACKESLASHEX = register("blackeslashex", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_BLACK_SLASH = register("black_slash", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_BLADEMASTER_YUKARI = register("blademaster_yukari", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_BLUE_FOX = register("blue_fox", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_BLUE_FOX_STAR_SOUL = register("blue_fox_star_soul", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_CIRNO = register("cirno", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_DOUBLE_YAMATO = register("double_yamato", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_DRAGONHEXAGRAM = register("dragonhexagram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_DREAM = register("dream", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_FINAL_STAR_SOUL = register("final_star_soul", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_FIRE_DRAGON = register("fire_dragon", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_FIVE_HEXGRAM = register("five_hexgram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_FOXHEXAGRAM = register("foxhexagram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_GODBLADEHEXAGRAM = register("godbladehexagram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_GREEN_INFLAMMATION = register("green_inflammation", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_GREEN_INFLAMMATION_STAR = register("green_inflammation_star", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_GREEN_YAMATO = register("green_yamato", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_HEXAGRAM = register("hexagram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_HISONOTSURUGI = register("hisonotsurugi", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_HUNDRED_CURSES = register("hundred_curses", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_HUNDRED_END = register("hundred_end", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_ICE_DRAGON = register("ice_dragon", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_LUCKY_SWORD = register("lucky_sword", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_LWT = register("lwt", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_MIRAGEEDGE = register("mirageedge", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_NIEBLADE_YUKARI = register("nieblade_yukari", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_PURPLE_FOX_STAR_SOUL = register("purple_fox_star_soul", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_RED = register("red", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_RED_FOX_STAR = register("red_fox_star", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_RED_FOX_STAR_SOUL = register("red_fox_star_soul", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_RED_SUN = register("red_sun", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_RU_SANG = register("ru_sang", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_SAN = register("san", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_SEVEN_HEXGRAM = register("seven_hexgram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_SEVEN_STAR = register("seven_star", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_SIX_HEXGRAM = register("six_hexgram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_SKY_RUINE = register("sky_ruine", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_STAR = register("star", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_STARSKY_RED = register("starsky_red", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_STARSTR = register("starstr", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_STAR_MUASUM = register("star_muasum", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_STAR_OF_DINZEER = register("star_of_dinzeer", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_SUN_RISE = register("sun_rise", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_TEN_HEXGRAM = register("ten_hexgram", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_UNDEAD_SLASH = register("undead_slash", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_VERGIL = register("vergil", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_WHITE = register("white", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YAKUMOSAKURA = register("yakumosakura", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YAKUMOSAKURA2 = register("yakumosakura2", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YAKUMOSAKURA3 = register("yakumosakura3", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YAKUMOSAKURAFINAL = register("yakumosakurafinal", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YELLOW_FOX = register("yellow_fox", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YE_SOUL = register("ye_soul", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YUKARI_BLADE = register("yukari_blade", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YUYUKO = register("yuyuko", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YUYUKO2 = register("yuyuko2", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YUYUKO3 = register("yuyuko3", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YUYUKOFINAL = register("yuyukofinal", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
        public static final Item SLASHBLADE_ADDON_YUYUKO_BEYOND = register("yuyuko_beyond", new ItemSlashBlade(new ItemTierSlashBlade(40, 4F), 4, 0.0F, new Item.Properties()));
    
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
                        case "yukari" -> SLASHBLADE_ADDON_YUKARI;
                        case "ciallo" -> SLASHBLADE_ADDON_CIALLO;
                        // yakumoblade 创意页常见子集
                        case "vergil" -> SLASHBLADE_ADDON_VERGIL;
                        case "double_yamato" -> SLASHBLADE_ADDON_DOUBLE_YAMATO;
                        case "green_inflammation" -> SLASHBLADE_ADDON_GREEN_INFLAMMATION;
                        case "green_yamato" -> SLASHBLADE_ADDON_GREEN_YAMATO;
                        case "hundred_curses" -> SLASHBLADE_ADDON_HUNDRED_CURSES;
                        case "ru_sang" -> SLASHBLADE_ADDON_RU_SANG;
                        case "undead_slash" -> SLASHBLADE_ADDON_UNDEAD_SLASH;
                        case "mirageedge" -> SLASHBLADE_ADDON_MIRAGEEDGE;
                            case "yellow_fox" -> SLASHBLADE_ADDON_YELLOW_FOX;
                        case "hisonotsurugi" -> SLASHBLADE_ADDON_HISONOTSURUGI;
                        case "yuyukofinal" -> SLASHBLADE_ADDON_YUYUKOFINAL;
                        case "yuyuko3" -> SLASHBLADE_ADDON_YUYUKO3;
                        case "star_of_dinzeer" -> SLASHBLADE_ADDON_STAR_OF_DINZEER;
                        case "star" -> SLASHBLADE_ADDON_STAR;
                        default -> null;
        };
    }
    
    private static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, SlashBladeAddon.prefix(name), item);
    }
}
