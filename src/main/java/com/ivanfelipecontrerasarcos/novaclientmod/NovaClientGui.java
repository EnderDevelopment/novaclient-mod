package com.ivanfelipecontrerasarcos.novaclientmod;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public
class NovaClientGui extends Screen {
    public NovaClientGui() {
        super(Text.literal("NovaClient GUI"));
    }

    @Override
    protected void init() {
        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Close"), button -> this.close()).dimensions(this.width / 2 - 100, this.height / 2 + 50, 200, 20).build());
    }

    public static void toggleGui() {
        if (NovaClientMod.client.currentScreen instanceof NovaClientGui) {
            NovaClientMod.client.setScreen(null);
        } else {
            NovaClientMod.client.setScreen(new NovaClientGui());
        }
    }
}
