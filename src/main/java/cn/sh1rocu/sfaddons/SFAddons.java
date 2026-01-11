package cn.sh1rocu.sfaddons;

import cn.mmf.energyblade.Energyblade;
import cn.mmf.energyblade.item.ItemFEBlade;
import cn.mmf.slashblade_addon.SlashBladeAddon;
import cn.mmf.slashblade_addon.specialeffect.BurstDrive;
import com.dinzeer.cialloblade.Cialloblade;
import com.dinzeer.cialloblade.se.Ciallo;
import com.exfantasycode.mclib.Utils.Dash.DashMessage;
import com.yakumosakura.yakumoblade.Yakumoblade;
import mods.flammpfeil.slashblade.event.SlashBladeEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public class SFAddons implements ModInitializer {

    public static final String MOD_ID = "slashblade_fabric_re_addons";

    @Override
    public void onInitialize() {
        // SJAP
        SlashBladeAddon.init();
        // CialloBlade
        Cialloblade.init();
        // EnergyBlade(HF Blade)
        Energyblade.init();
        // YakumoBlade
        Yakumoblade.init();

        registerS2CPackets();
        subscribeEvents();
    }

    private void subscribeEvents() {
        // SJAP
        SlashBladeEvent.DO_SLASH.register(BurstDrive::onDoingSlash);
        // CialloBlade
        SlashBladeEvent.HIT.register(Ciallo::onHitEntity);
        SlashBladeEvent.UPDATE.register(Ciallo::onUpdate);
        SlashBladeEvent.DO_SLASH.register(Ciallo::doSlash);
        // EnergyBlade(HF Blade)
        SlashBladeEvent.UPDATE.register(ItemFEBlade::onSlashBladeUpdate);
        SlashBladeEvent.HIT.register(ItemFEBlade::onSlashBladeHit);
        SlashBladeEvent.POWER_BLADE.register(ItemFEBlade::onSlashBladePowered);
    }

    public static ResourceLocation prefix(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    private static void registerS2CPackets() {
        // YakumoBlade
        registerS2CPacket(DashMessage.TYPE, DashMessage.STREAM_CODEC);
    }

    public static <T extends CustomPacketPayload> void registerS2CPacket(CustomPacketPayload.Type<T> type, StreamCodec<? super RegistryFriendlyByteBuf, T> codec) {
        PayloadTypeRegistry.playS2C().register(type, codec);
    }
}
