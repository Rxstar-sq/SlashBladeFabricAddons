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

    private static void addIfPresent(FabricItemGroupEntries entries, String bladeName) {
        var item = SBAItems.getNamedBladeItem(bladeName);
        if (item != null) {
            entries.accept(item);
        }
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

        // Distribute yakumoblade blades to their dedicated tabs (match 1.21.1 style)
        if (group == ItemTab.YASlashblade) {
            addIfPresent(entries, "vergil");
            addIfPresent(entries, "double_yamato");
            addIfPresent(entries, "green_inflammation");
            addIfPresent(entries, "green_yamato");
            addIfPresent(entries, "hundred_curses");
            addIfPresent(entries, "ru_sang");
            addIfPresent(entries, "undead_slash");
            addIfPresent(entries, "mirageedge");
            addIfPresent(entries, "yellow_fox");
        }

        if (group == ItemTab.YASlashbladeTouHou) {
            addIfPresent(entries, "hisonotsurugi");
            addIfPresent(entries, "yuyukofinal");
            addIfPresent(entries, "yuyuko3");
        }

        if (group == ItemTab.YASlashbladeStar) {
            addIfPresent(entries, "star_of_dinzeer");
            addIfPresent(entries, "star");
        }
    }
}
