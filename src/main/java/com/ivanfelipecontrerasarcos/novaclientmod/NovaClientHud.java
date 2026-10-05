package com.ivanfelipecontrerasarcos.novaclientmod;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

public
class NovaClientHud implements HudRenderCallback {
    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            drawContext.drawText(client.textRenderer, Text.literal("NovaClient HUD"), 10, 10, 0xFFFFFF, true);
        }
    }
}
