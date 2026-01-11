package com.yakumosakura.yakumoblade.registry.creativetab;

import com.yakumosakura.yakumoblade.registry.ItemRegistry;
import cn.mmf.slashblade_addon.registry.SBAItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTab;

public class YACreativeTabHandler {
    public static void register() {
        ItemGroupEvents.MODIFY_ENTRIES_ALL.register(YACreativeTabHandler::addCreative);
    }

    private static void addCreative(CreativeModeTab group, FabricItemGroupEntries entries) {
        // Add items to YAKUMOTAB (crafting materials)
        if (group == ItemTab.YAKUMOTAB) {
            entries.accept(ItemRegistry.UMLE);
            entries.accept(ItemRegistry.Star_Soul_Crystal);
            entries.accept(ItemRegistry.StarTreasurescripture);
            entries.accept(ItemRegistry.powercore);
            entries.accept(ItemRegistry.powercoreex);
        }

        // Add yakumoblade blades to YASlashblade tab statically
        if (group == ItemTab.YASlashblade) {
            entries.accept(SBAItems.SLASHBLADE_ADDON_VERGIL);
            entries.accept(SBAItems.SLASHBLADE_ADDON_DOUBLE_YAMATO);
            entries.accept(SBAItems.SLASHBLADE_ADDON_GREEN_INFLAMMATION);
            entries.accept(SBAItems.SLASHBLADE_ADDON_GREEN_YAMATO);
            entries.accept(SBAItems.SLASHBLADE_ADDON_HUNDRED_CURSES);
            entries.accept(SBAItems.SLASHBLADE_ADDON_RU_SANG);
            entries.accept(SBAItems.SLASHBLADE_ADDON_UNDEAD_SLASH);
            entries.accept(SBAItems.SLASHBLADE_ADDON_MIRAGEEDGE);
            entries.accept(SBAItems.SLASHBLADE_ADDON_YELLOW_FOX);
        }
    }
}
