package cn.sh1rocu.sfaddons.data;

import cn.mmf.energyblade.Energyblade;
import cn.mmf.slashblade_addon.registry.SBAItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class SFAddonsItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public SFAddonsItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.getOrCreateTagBuilder(ItemTags.SWORDS).add(
                Energyblade.FORGE_ENERGY_BLADE,
                // SlashBlade Addon blades
                SBAItems.SLASHBLADE_ADDON_AQUABLAZE,
                SBAItems.SLASHBLADE_ADDON_BLUE,
                SBAItems.SLASHBLADE_ADDON_CRIMSONCHERRY,
                SBAItems.SLASHBLADE_ADDON_DARK_RAVEN,
                SBAItems.SLASHBLADE_ADDON_FLUORESCENT_BAR,
                SBAItems.SLASHBLADE_ADDON_FROSTY_CHERRY,
                SBAItems.SLASHBLADE_ADDON_FROST_WOLF,
                SBAItems.SLASHBLADE_ADDON_GREEN_MIST,
                SBAItems.SLASHBLADE_ADDON_HF_MURASAMA,
                SBAItems.SLASHBLADE_ADDON_KAMUY_FIRE,
                SBAItems.SLASHBLADE_ADDON_KAMUY_LIGHTNING,
                SBAItems.SLASHBLADE_ADDON_KAMUY_NONE,
                SBAItems.SLASHBLADE_ADDON_KAMUY_WATER,
                SBAItems.SLASHBLADE_ADDON_KATANA,
                SBAItems.SLASHBLADE_ADDON_KIRISAYA,
                SBAItems.SLASHBLADE_ADDON_LAEMMLE,
                SBAItems.SLASHBLADE_ADDON_MOONLIGHT_CHERRY,
                SBAItems.SLASHBLADE_ADDON_MURAKUMO,
                SBAItems.SLASHBLADE_ADDON_NIHIL,
                SBAItems.SLASHBLADE_ADDON_NIHILBX,
                SBAItems.SLASHBLADE_ADDON_NIHILEX,
                SBAItems.SLASHBLADE_ADDON_NIHILUL,
                SBAItems.SLASHBLADE_ADDON_SNOW_CROW,
                SBAItems.SLASHBLADE_ADDON_TACHI,
                SBAItems.SLASHBLADE_ADDON_TBOEN,
                SBAItems.SLASHBLADE_ADDON_TERRA_BLADE,
                SBAItems.SLASHBLADE_ADDON_TOYAKO,
                SBAItems.SLASHBLADE_ADDON_WANDERER,
                SBAItems.SLASHBLADE_ADDON_WANDERER_HF,
                SBAItems.SLASHBLADE_ADDON_YUKARI,
                SBAItems.SLASHBLADE_ADDON_CIALLO
        );
    }
}
