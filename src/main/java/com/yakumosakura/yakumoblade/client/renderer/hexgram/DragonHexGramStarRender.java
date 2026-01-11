package com.yakumosakura.yakumoblade.client.renderer.hexgram;

import com.mojang.blaze3d.vertex.PoseStack;
import com.yakumosakura.yakumoblade.entity.hexgram.b.DragonHexGramStar;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

@Environment(EnvType.CLIENT)
public class DragonHexGramStarRender extends EntityRenderer<DragonHexGramStar> {
    public DragonHexGramStarRender(EntityRendererProvider.Context context) {
        super(context);
        this.shadowRadius = 0.0F;
    }

    @Override
    public void render(DragonHexGramStar entity, float entityYaw, float partialTicks, PoseStack matrices,
                       MultiBufferSource buffer, int packedLight) {
        // No-op renderer: entity is intentionally invisible client-side but still needs a registered renderer.
    }

    @Override
    public ResourceLocation getTextureLocation(DragonHexGramStar entity) {
        return null;
    }
}
