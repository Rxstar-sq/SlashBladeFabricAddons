package cn.mmf.slashblade_addon.data;

import cn.mmf.energyblade.Energyblade;
import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.registry.SBAItems;
import cn.mmf.slashblade_addon.registry.SBASlashArtsRegistry;
import cn.mmf.slashblade_addon.registry.SBASpecialEffectsRegistry;
import cn.sh1rocu.sfaddons.SFAddons;
import mods.flammpfeil.slashblade.client.renderer.CarryType;
import mods.flammpfeil.slashblade.item.SwordType;
import mods.flammpfeil.slashblade.registry.SlashArtsRegistry;
import mods.flammpfeil.slashblade.registry.SpecialEffectsRegistry;
import mods.flammpfeil.slashblade.registry.slashblade.EnchantmentDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.PropertiesDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.RenderDefinition;
import mods.flammpfeil.slashblade.registry.slashblade.SlashBladeDefinition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlashBladeAddonBuiltInRegistry {

    //Nihil
    public static final ResourceKey<SlashBladeDefinition> NIHIL = register("nihil");
    public static final ResourceKey<SlashBladeDefinition> NIHILEX = register("nihilex");
    public static final ResourceKey<SlashBladeDefinition> NIHILBX = register("nihilbx");
    public static final ResourceKey<SlashBladeDefinition> NIHILUL = register("nihilul");
    public static final ResourceKey<SlashBladeDefinition> CRIMSONCHERRY = register("crimsoncherry");

    //WA
    public static final ResourceKey<SlashBladeDefinition> KATANA = register("katana");
    public static final ResourceKey<SlashBladeDefinition> TACHI = register("tachi");
    public static final ResourceKey<SlashBladeDefinition> BLUE = register("blue");

    //BladeMaster
    public static final ResourceKey<SlashBladeDefinition> GREEN_MIST = register("green_mist");
    public static final ResourceKey<SlashBladeDefinition> AQUABLAZE = register("aquablaze");
    public static final ResourceKey<SlashBladeDefinition> MOONLIGHT_CHERRY = register("moonlight_cherry");

    //Dark Raven
    public static final ResourceKey<SlashBladeDefinition> DARK_RAVEN = register("dark_raven");
    public static final ResourceKey<SlashBladeDefinition> SNOW_CROW = register("snow_crow");

    //Fluorescent Bar
    public static final ResourceKey<SlashBladeDefinition> FLUORESCENT_BAR = register("fluorescent_bar");

    //Frost Wolf
    public static final ResourceKey<SlashBladeDefinition> FROSTY_CHERRY = register("frosty_cherry");
    public static final ResourceKey<SlashBladeDefinition> FROST_WOLF = register("frost_wolf");

    //Toyako
    public static final ResourceKey<SlashBladeDefinition> TOYAKO = register("toyako");

    //Yukari
    public static final ResourceKey<SlashBladeDefinition> YUKARI = register("yukari");

    //Laemmle
    public static final ResourceKey<SlashBladeDefinition> LAEMMLE = register("laemmle");

    //Tboen
    public static final ResourceKey<SlashBladeDefinition> TBOEN = register("tboen");

    public static final ResourceKey<SlashBladeDefinition> KIRISAYA = register("kirisaya");

    public static final ResourceKey<SlashBladeDefinition> TERRA_BLADE = register("terra_blade");

    //Laemmle
    public static final ResourceKey<SlashBladeDefinition> KAMUY_NONE = register("kamuy_none");

    public static final ResourceKey<SlashBladeDefinition> KAMUY_WATER = register("kamuy_water");

    public static final ResourceKey<SlashBladeDefinition> KAMUY_FIRE = register("kamuy_fire");

    public static final ResourceKey<SlashBladeDefinition> KAMUY_LIGHTING = register("kamuy_lightning");

    public static final ResourceKey<SlashBladeDefinition> HF_MURASAMA = register("hf_murasama");

    //wanderer
    public static final ResourceKey<SlashBladeDefinition> WANDERER = register("wanderer");
    public static final ResourceKey<SlashBladeDefinition> WANDERER_HF = register("wanderer_hf");

    public static final ResourceKey<SlashBladeDefinition> MURAKUMO = register("murakumo");

    // yakumoblade series - 全量57把
    public static final ResourceKey<SlashBladeDefinition> VERGIL = register("vergil");
    public static final ResourceKey<SlashBladeDefinition> DOUBLE_YAMATO = register("double_yamato");
    public static final ResourceKey<SlashBladeDefinition> GREEN_INFLAMMATION = register("green_inflammation");
    public static final ResourceKey<SlashBladeDefinition> GREEN_YAMATO = register("green_yamato");
    public static final ResourceKey<SlashBladeDefinition> HUNDRED_CURSES = register("hundred_curses");
    public static final ResourceKey<SlashBladeDefinition> RU_SANG = register("ru_sang");
    public static final ResourceKey<SlashBladeDefinition> UNDEAD_SLASH = register("undead_slash");
    public static final ResourceKey<SlashBladeDefinition> MIRAGEEDGE = register("mirageedge");
    public static final ResourceKey<SlashBladeDefinition> YELLOW_FOX = register("yellow_fox");
    public static final ResourceKey<SlashBladeDefinition> HISONOTSURUGI = register("hisonotsurugi");
    public static final ResourceKey<SlashBladeDefinition> BLACKESLASHEX = register("blackeslashex");
    public static final ResourceKey<SlashBladeDefinition> BLACK_SLASH = register("black_slash");
    public static final ResourceKey<SlashBladeDefinition> BLADEMASTER_YUKARI = register("blademaster_yukari");
    public static final ResourceKey<SlashBladeDefinition> BLUE_FOX = register("blue_fox");
    public static final ResourceKey<SlashBladeDefinition> BLUE_FOX_STAR_SOUL = register("blue_fox_star_soul");
    public static final ResourceKey<SlashBladeDefinition> CIRNO = register("cirno");
    public static final ResourceKey<SlashBladeDefinition> DRAGONHEXAGRAM = register("dragonhexagram");
    public static final ResourceKey<SlashBladeDefinition> DREAM = register("dream");
    public static final ResourceKey<SlashBladeDefinition> FINAL_STAR_SOUL = register("final_star_soul");
    public static final ResourceKey<SlashBladeDefinition> FIRE_DRAGON = register("fire_dragon");
    public static final ResourceKey<SlashBladeDefinition> FIVE_HEXGRAM = register("five_hexgram");
    public static final ResourceKey<SlashBladeDefinition> FOXHEXAGRAM = register("foxhexagram");
    public static final ResourceKey<SlashBladeDefinition> GODBLADEHEXAGRAM = register("godbladehexagram");
    public static final ResourceKey<SlashBladeDefinition> GREEN_INFLAMMATION_STAR = register("green_inflammation_star");
    public static final ResourceKey<SlashBladeDefinition> HEXAGRAM = register("hexagram");
    public static final ResourceKey<SlashBladeDefinition> HUNDRED_END = register("hundred_end");
    public static final ResourceKey<SlashBladeDefinition> ICE_DRAGON = register("ice_dragon");
    public static final ResourceKey<SlashBladeDefinition> LUCKY_SWORD = register("lucky_sword");
    public static final ResourceKey<SlashBladeDefinition> LWT = register("lwt");
    public static final ResourceKey<SlashBladeDefinition> NIEBLADE_YUKARI = register("nieblade_yukari");
    public static final ResourceKey<SlashBladeDefinition> PURPLE_FOX_STAR_SOUL = register("purple_fox_star_soul");
    public static final ResourceKey<SlashBladeDefinition> RED = register("red");
    public static final ResourceKey<SlashBladeDefinition> RED_FOX_STAR = register("red_fox_star");
    public static final ResourceKey<SlashBladeDefinition> RED_FOX_STAR_SOUL = register("red_fox_star_soul");
    public static final ResourceKey<SlashBladeDefinition> RED_SUN = register("red_sun");
    public static final ResourceKey<SlashBladeDefinition> SAN = register("san");
    public static final ResourceKey<SlashBladeDefinition> SEVEN_HEXGRAM = register("seven_hexgram");
    public static final ResourceKey<SlashBladeDefinition> SEVEN_STAR = register("seven_star");
    public static final ResourceKey<SlashBladeDefinition> SIX_HEXGRAM = register("six_hexgram");
    public static final ResourceKey<SlashBladeDefinition> SKY_RUINE = register("sky_ruine");
    public static final ResourceKey<SlashBladeDefinition> STAR = register("star");
    public static final ResourceKey<SlashBladeDefinition> STAR_MUASUM = register("star_muasum");
    public static final ResourceKey<SlashBladeDefinition> STAR_OF_DINZEER = register("star_of_dinzeer");
    public static final ResourceKey<SlashBladeDefinition> STARSKY_RED = register("starsky_red");
    public static final ResourceKey<SlashBladeDefinition> STARSTR = register("starstr");
    public static final ResourceKey<SlashBladeDefinition> SUN_RISE = register("sun_rise");
    public static final ResourceKey<SlashBladeDefinition> TEN_HEXGRAM = register("ten_hexgram");
    public static final ResourceKey<SlashBladeDefinition> WHITE = register("white");
    public static final ResourceKey<SlashBladeDefinition> YAKUMOSAKURA = register("yakumosakura");
    public static final ResourceKey<SlashBladeDefinition> YAKUMOSAKURA2 = register("yakumosakura2");
    public static final ResourceKey<SlashBladeDefinition> YAKUMOSAKURA3 = register("yakumosakura3");
    public static final ResourceKey<SlashBladeDefinition> YAKUMOSAKURAFINAL = register("yakumosakurafinal");
    public static final ResourceKey<SlashBladeDefinition> YE_SOUL = register("ye_soul");
    public static final ResourceKey<SlashBladeDefinition> YUKARI_BLADE = register("yukari_blade");
    public static final ResourceKey<SlashBladeDefinition> YUYUKO = register("yuyuko");
    public static final ResourceKey<SlashBladeDefinition> YUYUKO2 = register("yuyuko2");
    public static final ResourceKey<SlashBladeDefinition> YUYUKO3 = register("yuyuko3");
    public static final ResourceKey<SlashBladeDefinition> YUYUKOFINAL = register("yuyukofinal");
    public static final ResourceKey<SlashBladeDefinition> YUYUKO_BEYOND = register("yuyuko_beyond");


    private static final Map<ResourceKey<SlashBladeDefinition>, List<ResourceCondition>> CONDITIONS = new HashMap<>();

    public static Map<ResourceKey<SlashBladeDefinition>, List<ResourceCondition>> getConditions() {
        return CONDITIONS;
    }

    public static void addConditions(ResourceKey<SlashBladeDefinition> key, ResourceCondition conditions) {
        CONDITIONS.computeIfAbsent(key, k -> List.of(conditions));
    }

    public static class SJAPDefinition extends SlashBladeDefinition {
        public SJAPDefinition(ResourceLocation name, RenderDefinition renderDefinition, PropertiesDefinition stateDefinition, List<EnchantmentDefinition> enchantments) {
            super(name, renderDefinition, stateDefinition, enchantments, BuiltInRegistries.CREATIVE_MODE_TAB.getKey(SlashBladeAddon.SJAP_TAB));
        }

        public SJAPDefinition(ResourceLocation item, ResourceLocation name, RenderDefinition renderDefinition, PropertiesDefinition stateDefinition, List<EnchantmentDefinition> enchantments) {
            super(item, name, renderDefinition, stateDefinition, enchantments, BuiltInRegistries.CREATIVE_MODE_TAB.getKey(SlashBladeAddon.SJAP_TAB));
        }
    }

    public static void registerAll(BootstrapContext<SlashBladeDefinition> bootstrap) {
        //MURAKUMO
        bootstrap.register(MURAKUMO,
                new SJAPDefinition(SlashBladeAddon.prefix("murakumo"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/murakumo/texture.png"))
                                .modelName(SlashBladeAddon.prefix("model/murakumo/model.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(9.0F)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.SAKURA_END))
                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                .maxDamage(80).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 1))));

        bootstrap.register(HF_MURASAMA, new SJAPDefinition(BuiltInRegistries.ITEM.getKey(Energyblade.FORGE_ENERGY_BLADE),
                SlashBladeAddon.prefix("hf_murasama"),
                RenderDefinition.Builder.newInstance()
                        .textureName(SlashBladeAddon.prefix("model/murasama/murasama.png"))
                        .modelName(SlashBladeAddon.prefix("model/murasama/murasama.obj"))
                        .effectColor(0xFFFF2600)
                        .standbyRenderType(CarryType.PSO2).build(),
                PropertiesDefinition.Builder.newInstance().baseAttackModifier(8.0F).maxDamage(250)
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.SPIRAL_EDGE)).build(),
                List.of()));
        bootstrap.register(WANDERER_HF, new SJAPDefinition(BuiltInRegistries.ITEM.getKey(Energyblade.FORGE_ENERGY_BLADE),
                SlashBladeAddon.prefix("wanderer_hf"),
                RenderDefinition.Builder.newInstance()
                        .textureName(SlashBladeAddon.prefix("model/wanderer/wanderer.png"))
                        .modelName(SlashBladeAddon.prefix("model/wanderer/wanderer.obj"))
                        .standbyRenderType(CarryType.NINJA).build(),
                PropertiesDefinition.Builder.newInstance().baseAttackModifier(7.0F).maxDamage(70)
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.RAPID_BLISTERING_SWORDS)).build(),
                List.of()));
        addConditions(WANDERER_HF, ResourceConditions.registryContains(Registries.ITEM, BuiltInRegistries.ITEM.getKey(Energyblade.FORGE_ENERGY_BLADE)));
        addConditions(HF_MURASAMA, ResourceConditions.registryContains(Registries.ITEM, BuiltInRegistries.ITEM.getKey(Energyblade.FORGE_ENERGY_BLADE)));

        bootstrap.register(WANDERER, new SJAPDefinition(
                SlashBladeAddon.prefix("wanderer"),
                RenderDefinition.Builder.newInstance()
                        .textureName(SlashBladeAddon.prefix("model/wanderer/wanderer.png"))
                        .modelName(SlashBladeAddon.prefix("model/wanderer/wanderer.obj"))
                        .standbyRenderType(CarryType.NINJA).build(),
                PropertiesDefinition.Builder.newInstance().baseAttackModifier(7.0F).maxDamage(60)
                        .defaultSwordType(List.of(SwordType.BEWITCHED))
                        .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.RAPID_BLISTERING_SWORDS)).build(),
                List.of()));

        bootstrap.register(KAMUY_NONE,
                new SJAPDefinition(SlashBladeAddon.prefix("kamuy_none"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/kamuy/kamuy.png"))
                                .modelName(SlashBladeAddon.prefix("model/kamuy/kamuy.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(7.0F)
                                .maxDamage(45)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.CIRCLE_SLASH))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.LOOTING), 1)))
        );

        bootstrap.register(KAMUY_WATER,
                new SJAPDefinition(SlashBladeAddon.prefix("kamuy_water"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/kamuy/water.png"))
                                .modelName(SlashBladeAddon.prefix("model/kamuy/kamuy.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(7.0F)
                                .maxDamage(50)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.WATER_DRIVE))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.KNOCKBACK), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.LOOTING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_PROTECTION), 1)))
        );

        bootstrap.register(KAMUY_LIGHTING,
                new SJAPDefinition(SlashBladeAddon.prefix("kamuy_lightning"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/kamuy/lightning.png"))
                                .modelName(SlashBladeAddon.prefix("model/kamuy/kamuy.obj"))
                                .effectColor(0xFFFAE900)
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(7.0F)
                                .maxDamage(50)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.LIGHTING_SWORDS))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FEATHER_FALLING), 1)))
        );

        bootstrap.register(KAMUY_FIRE,
                new SJAPDefinition(SlashBladeAddon.prefix("kamuy_fire"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/kamuy/fire.png"))
                                .modelName(SlashBladeAddon.prefix("model/kamuy/kamuy.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .effectColor(0xFFEE2600)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(7.0F)
                                .maxDamage(40)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.FIRE_SPIRAL))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_PROTECTION), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 1)))
        );

        bootstrap.register(TERRA_BLADE,
                new SJAPDefinition(SlashBladeAddon.prefix("terra_blade"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/terra/terra.png"))
                                .modelName(SlashBladeAddon.prefix("model/terra/terra.obj"))
                                .standbyRenderType(CarryType.RNINJA)
                                .effectColor(3524113)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(6.0F)
                                .maxDamage(60)
                                .slashArtsType(SlashBladeAddon.prefix("blistering_terra_swords")/*SlashArtsRegistry.SLASH_ARTS.getKey(SBABotaniaCompat.BLISTERING_TERRA_SWORDS_SA)*/)
                                .addSpecialEffect(SlashBladeAddon.prefix("mana_burst")/*SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SBABotaniaCompat.MANA_BURST)*/)
                                .addSpecialEffect(SlashBladeAddon.prefix("mana_repair")/*SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SBABotaniaCompat.MANA_REPAIR)*/)
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 1))));

        addConditions(TERRA_BLADE, ResourceConditions.allModsLoaded("botania"));

        //Kirisaya
        bootstrap.register(KIRISAYA,
                new SJAPDefinition(SlashBladeAddon.prefix("kirisaya"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/kirisaya/kirisaya.png"))
                                .modelName(SlashBladeAddon.prefix("model/kirisaya/kirisaya.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(3.0F)
                                .maxDamage(11)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.DRIVE_HORIZONTAL))
                                .addSpecialEffect(SpecialEffectsRegistry.SPECIAL_EFFECT.getKey(SBASpecialEffectsRegistry.BURST_DRIVE))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 5)
                        )));

        //Laemmle
        bootstrap.register(LAEMMLE,
                new SJAPDefinition(SlashBladeAddon.prefix("laemmle"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/laemmle/lem.png"))
                                .modelName(SlashBladeAddon.prefix("model/laemmle/blade.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(7.0F)
                                .maxDamage(80).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3))));

        //Yukari
        bootstrap.register(YUKARI,
                new SJAPDefinition(BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_YUKARI), SlashBladeAddon.prefix("yukari"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/yukari/texture.png"))
                                .modelName(SlashBladeAddon.prefix("model/yukari/model.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(8.0F)
                                .maxDamage(50)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.DRIVE_HORIZONTAL))
                                .defaultSwordType(List.of(SwordType.NONE)).build(), List.of()));

        //Tboen
        bootstrap.register(TBOEN,
                new SJAPDefinition(SlashBladeAddon.prefix("tboen"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/tboen/texture.png"))
                                .modelName(SlashBladeAddon.prefix("model/tboen/model.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(6.0F)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.SAKURA_END))
                                .maxDamage(70)
                                .defaultSwordType(List.of(SwordType.NONE)).build(), List.of()));

        //Toyako
        bootstrap.register(TOYAKO,
                new SJAPDefinition(SlashBladeAddon.prefix("toyako"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/toyako/toyako.png"))
                                .modelName(SlashBladeAddon.prefix("model/toyako/toyako.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(6.0F)
                                .maxDamage(70)
                                .defaultSwordType(List.of(SwordType.NONE)).build(), List.of()));

        //nihil
        bootstrap.register(NIHIL,
                new SJAPDefinition(SlashBladeAddon.prefix("nihil"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/nihil/nihil.png"))
                                .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(8.0F)
                                .maxDamage(45)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.DRIVE_HORIZONTAL))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 1))));

        bootstrap.register(NIHILEX,
                new SJAPDefinition(SlashBladeAddon.prefix("nihilex"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/nihil/nihilex.png"))
                                .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(10.0F)
                                .maxDamage(60)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.WAVE_EDGE))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 1),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.LOOTING), 1))));

        bootstrap.register(NIHILUL,
                new SJAPDefinition(SlashBladeAddon.prefix("nihilul"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/nihil/nihilul.png"))
                                .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(12.0F)
                                .maxDamage(70)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.WAVE_EDGE))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.LOOTING), 3))));

        bootstrap.register(CRIMSONCHERRY,
                new SJAPDefinition(SlashBladeAddon.prefix("crimsoncherry"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/nihil/crimsoncherry.png"))
                                .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(11.0F)
                                .maxDamage(65)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.SAKURA_END))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2))));

        bootstrap.register(NIHILBX,
                new SJAPDefinition(SlashBladeAddon.prefix("nihilbx"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/nihil/nihil_bx.png"))
                                .modelName(SlashBladeAddon.prefix("model/nihil/nihil.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(13.0F)
                                .maxDamage(240)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.SAKURA_END))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 5),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2))));

        //WA
        bootstrap.register(KATANA,
                new SJAPDefinition(SlashBladeAddon.prefix("katana"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/wa/katana.png"))
                                .modelName(SlashBladeAddon.prefix("model/wa/wa.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(3.0F)
                                .maxDamage(457)
                                .defaultSwordType(List.of(SwordType.NONE)).build(), List.of()));

        bootstrap.register(TACHI,
                new SJAPDefinition(SlashBladeAddon.prefix("tachi"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/wa/tachi.png"))
                                .modelName(SlashBladeAddon.prefix("model/wa/wa.obj"))
                                .standbyRenderType(CarryType.DEFAULT)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(3.0F)
                                .maxDamage(457)
                                .defaultSwordType(List.of(SwordType.NONE)).build(), List.of()));

        bootstrap.register(BLUE,
                new SJAPDefinition(SlashBladeAddon.prefix("blue"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/wa/blue.png"))
                                .modelName(SlashBladeAddon.prefix("model/wa/wa.obj"))
                                .standbyRenderType(CarryType.KATANA)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(7.0F)
                                .maxDamage(75)
                                .defaultSwordType(List.of(SwordType.NONE)).build(), List.of()));

        //BladeMaster
        bootstrap.register(GREEN_MIST,
                new SJAPDefinition(SlashBladeAddon.prefix("green_mist"),
                        RenderDefinition.Builder.newInstance()
                                .textureName(SlashBladeAddon.prefix("model/blademaster/green_mist.png"))
                                .modelName(SlashBladeAddon.prefix("model/blademaster/blademaster.obj"))
                                .standbyRenderType(CarryType.PSO2)
                                .build(),
                        PropertiesDefinition.Builder.newInstance()
                                .baseAttackModifier(4.0F + Tiers.DIAMOND.getAttackDamageBonus())
                                .maxDamage(60)
                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.RAPID_BLISTERING_SWORDS))
                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                        List.of(new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 3),
                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FORTUNE), 3))));

        bootstrap.register
                (
                        AQUABLAZE,
                        new SJAPDefinition
                                (
                                        SlashBladeAddon.prefix("aquablaze"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SlashBladeAddon.prefix("model/blademaster/aquablaze.png"))
                                                .modelName(SlashBladeAddon.prefix("model/blademaster/blademaster.obj"))
                                                .standbyRenderType(CarryType.PSO2)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(4.0F + Tiers.DIAMOND.getAttackDamageBonus())
                                                .maxDamage(60)
                                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.SPIRAL_EDGE))
                                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                                        List.of
                                                (
                                                        new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 2),
                                                        new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_PROTECTION), 1)
                                                )
                                )
                );

        bootstrap.register
                (
                        MOONLIGHT_CHERRY,
                        new SJAPDefinition
                                (
                                        SlashBladeAddon.prefix("moonlight_cherry"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SlashBladeAddon.prefix("model/blademaster/moonlightcherry.png"))
                                                .modelName(SlashBladeAddon.prefix("model/blademaster/blademaster.obj"))
                                                .standbyRenderType(CarryType.PSO2)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(4.0F + Tiers.DIAMOND.getAttackDamageBonus())
                                                .maxDamage(60)
                                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.GALE_SWORDS))
                                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                                        List.of
                                                (
                                                        new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 1),
                                                        new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 5)
                                                )
                                )
                );

        //Dark Raven
        bootstrap.register
                (
                        DARK_RAVEN,
                        new SJAPDefinition
                                (
                                        SlashBladeAddon.prefix("dark_raven"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SlashBladeAddon.prefix("model/darkraven/dark_raven.png"))
                                                .modelName(SlashBladeAddon.prefix("model/darkraven/dark_raven.obj"))
                                                .standbyRenderType(CarryType.PSO2)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(4.0F + Tiers.DIAMOND.getAttackDamageBonus())
                                                .maxDamage(80)
                                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SlashArtsRegistry.WAVE_EDGE))
                                                .defaultSwordType(List.of(SwordType.NONE)).build(),
                                        List.of()
                                )
                );

        bootstrap.register
                (
                        SNOW_CROW,
                        new SJAPDefinition
                                (
                                        SlashBladeAddon.prefix("snow_crow"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SlashBladeAddon.prefix("model/darkraven/snow_crow.png"))
                                                .modelName(SlashBladeAddon.prefix("model/darkraven/snow_crow.obj"))
                                                .standbyRenderType(CarryType.PSO2)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(4.0F + Tiers.IRON.getAttackDamageBonus())
                                                .maxDamage(60)
                                                .defaultSwordType(List.of(SwordType.NONE)).build(),
                                        List.of()
                                )
                );

        //Fluorescent Bar
        bootstrap.register
                (
                        FLUORESCENT_BAR,
                        new SJAPDefinition
                                (
                                        SlashBladeAddon.prefix("fluorescent_bar"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SlashBladeAddon.prefix("model/fluorescentbar/fluorescent_bar.png"))
                                                .modelName(SlashBladeAddon.prefix("model/fluorescentbar/fluorescent_bar.obj"))
                                                .standbyRenderType(CarryType.PSO2)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(2.0F)
                                                .maxDamage(Tiers.DIAMOND.getUses())
                                                .defaultSwordType(List.of(SwordType.NONE)).build(),
                                        List.of
                                                (
                                                        new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3)
                                                )
                                )
                );

        //Frost Wolf
        bootstrap.register
                (
                        FROSTY_CHERRY,
                        new SJAPDefinition
                                (
                                        SlashBladeAddon.prefix("frosty_cherry"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SlashBladeAddon.prefix("model/frostwolf/frosty_cherry.png"))
                                                .modelName(SlashBladeAddon.prefix("model/frostwolf/frosty_cherry.obj"))
                                                .standbyRenderType(CarryType.PSO2)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(4.0F + Tiers.DIAMOND.getAttackDamageBonus())
                                                .maxDamage(150)
                                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.RAPID_BLISTERING_SWORDS))
                                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                                        List.of()
                                )
                );

        bootstrap.register
                (
                        FROST_WOLF,
                        new SJAPDefinition
                                (
                                        SlashBladeAddon.prefix("frost_wolf"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SlashBladeAddon.prefix("model/frostwolf/frost_wolf.png"))
                                                .modelName(SlashBladeAddon.prefix("model/frostwolf/frost_wolf.obj"))
                                                .standbyRenderType(CarryType.PSO2)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(4.0F + Tiers.DIAMOND.getAttackDamageBonus())
                                                .maxDamage(150)
                                                .slashArtsType(SlashArtsRegistry.SLASH_ARTS.getKey(SBASlashArtsRegistry.GALE_SWORDS))
                                                .defaultSwordType(List.of(SwordType.BEWITCHED)).build(),
                                        List.of()
                                )
                );

        // yakumoblade series
        // 真 •「閻魔刀」
        bootstrap.register
                (
                        VERGIL,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_VERGIL),
                                        SFAddons.prefix("yakumoblade/vergil"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/named/custom/vergil/texture.png"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/named/custom/vergil/model.obj"))
                                                .effectColor(2003199)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                                .baseAttackModifier(50)
                                                .maxDamage(120)
                                                .build(),
                                        List.of(
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 10),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SOUL_SPEED), 10),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FEATHER_FALLING), 10),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 10)
                                        )
                                )
                );

        // 大和·贰
        bootstrap.register
                (
                        DOUBLE_YAMATO,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_DOUBLE_YAMATO),
                                        SFAddons.prefix("yakumoblade/double_yamato"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/relicofpaseone/yamato.png"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/relicofpaseone/double.obj"))
                                                .effectColor(3729097)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(22)
                                                .maxDamage(180)
                                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                                .build(),
                                        List.of(
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 3),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 3),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.LOOTING), 3)
                                        )
                                )
                );

        // 染绿炎
        bootstrap.register
                (
                        GREEN_INFLAMMATION,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_GREEN_INFLAMMATION),
                                        SFAddons.prefix("yakumoblade/green_inflammation"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/relicofpaseone/green_inflammation.png"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/relicofpaseone/green_inflammation.obj"))
                                                .effectColor(2424576)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(22)
                                                .maxDamage(180)
                                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                                .build(),
                                        List.of(
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 5),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 5),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 3),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.LOOTING), 10)
                                        )
                                )
                );

        // 大和
        bootstrap.register
                (
                        GREEN_YAMATO,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_GREEN_YAMATO),
                                        SFAddons.prefix("yakumoblade/green_yamato"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/relicofpaseone/yamato.png"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/relicofpaseone/dahe.obj"))
                                                .effectColor(3729097)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(10)
                                                .maxDamage(180)
                                                .build(),
                                        List.of()
                                )
                );

        // 百涙
        bootstrap.register
                (
                        HUNDRED_CURSES,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_HUNDRED_CURSES),
                                        SFAddons.prefix("yakumoblade/hundred_curses"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/relicofpaseone/hundred_curses.png"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/relicofpaseone/hundred_curses.obj"))
                                                .effectColor(8126719)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(20)
                                                .maxDamage(180)
                                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                                .build(),
                                        List.of(
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 6),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.UNBREAKING), 6),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 6),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SHARPNESS), 6),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 6),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.KNOCKBACK), 6)
                                        )
                                )
                );

        // 如丧
        bootstrap.register
                (
                        RU_SANG,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_RU_SANG),
                                        SFAddons.prefix("yakumoblade/ru_sang"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/relicofpaseone/ru_sang.png"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/relicofpaseone/ru_sang.obj"))
                                                .effectColor(12013391)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(13)
                                                .maxDamage(180)
                                                .build(),
                                        List.of()
                                )
                );

        // 不死斩
        bootstrap.register
                (
                        UNDEAD_SLASH,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_UNDEAD_SLASH),
                                        SFAddons.prefix("yakumoblade/undead_slash"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/awolf/undead_slash.jpg"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/awolf/undead_slash.obj"))
                                                .effectColor(13504014)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(25)
                                                .maxDamage(180)
                                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                                .build(),
                                        List.of(
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 5),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 10),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.BANE_OF_ARTHROPODS), 10),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.PUNCH), 3)
                                        )
                                )
                );

        // 幻影刃
        bootstrap.register
                (
                        MIRAGEEDGE,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_MIRAGEEDGE),
                                        SFAddons.prefix("yakumoblade/mirageedge"),
                                        RenderDefinition.Builder.newInstance()
                                                .textureName(SFAddons.prefix("yakumoblade/model/named/custom/vergil/mirageedge.png"))
                                                .modelName(SFAddons.prefix("yakumoblade/model/named/custom/vergil/mirageedge.obj"))
                                                .effectColor(2003199)
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                                .baseAttackModifier(10)
                                                .maxDamage(120)
                                                .build(),
                                        List.of(
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 10)
                                        )
                                )
                );

        // 名刀「酒狐」
        bootstrap.register
                (
                        YELLOW_FOX,
                        new SJAPDefinition
                                (
                                        BuiltInRegistries.ITEM.getKey(SBAItems.SLASHBLADE_ADDON_YELLOW_FOX),
                                        SFAddons.prefix("yakumoblade/yellow_fox"),
                                        RenderDefinition.Builder.newInstance()
                                                .effectColor(16754944)
                                                .modelName(SFAddons.prefix("yakumoblade/model/named/sange/sange.obj"))
                                                .textureName(SFAddons.prefix("yakumoblade/model/named/sange/yellow_fox.png"))
                                                .build(),
                                        PropertiesDefinition.Builder.newInstance()
                                                .baseAttackModifier(25F)
                                                .maxDamage(180)
                                                .defaultSwordType(List.of(SwordType.BEWITCHED))
                                                .build(),
                                        List.of(
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.POWER), 6),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.SMITE), 10),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.FIRE_ASPECT), 1),
                                                new EnchantmentDefinition(getEnchantmentID(Enchantments.THORNS), 3)
                                        )
                                )
                );

    }

    private static ResourceKey<SlashBladeDefinition> register(String id) {

        return ResourceKey.create(SlashBladeDefinition.REGISTRY_KEY, SlashBladeAddon.prefix(id));
    }

    private static ResourceLocation getEnchantmentID(ResourceKey<Enchantment> key) {
        return key.location();
    }
}
