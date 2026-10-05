package com.ivanfelipecontrerasarcos.novaclientmod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public
class NovaClientConfig {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File CONFIG_FILE = new File("config/novaclient.json");

    public static void saveConfig() {
        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            GSON.toJson(NovaClientMod.config, writer);
        } catch (IOException e) {
            NovaClientMod.LOGGER.error("Failed to save config", e);
        }
    }

    public static void loadConfig() {
        if (!CONFIG_FILE.exists()) {
            saveConfig();
            return;
        }
        try (FileReader reader = new FileReader(CONFIG_FILE)) {
            NovaClientMod.config = GSON.fromJson(reader, NovaClientMod.Config.class);
        } catch (IOException e) {
            NovaClientMod.LOGGER.error("Failed to load config", e);
        }
    }
}
