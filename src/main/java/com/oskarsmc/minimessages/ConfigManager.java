package com.oskarsmc.minimessages;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class ConfigManager {
    private static final MiniMessages PLUGIN = MiniMessages.getPlugin(MiniMessages.class);
    private static final MiniMessage MINI_MESSAGE = MiniMessage.get();
    private static MiniMessagesConfig miniMessagesConfig;

    public static Component getJoinMessage(String playerName) {
        return MINI_MESSAGE.parse(miniMessagesConfig.getJoinMsg().replace("$player$", playerName));
    }

    public static Component getQuitMessage(String playerName) {
        return MINI_MESSAGE.parse(miniMessagesConfig.getJoinMsg().replace("$player$", playerName));
    }

    public static MiniMessagesConfig getMiniMessagesConfig() {
        return miniMessagesConfig;
    }

    public static void reloadConfig() {
        PLUGIN.getConfig().options().copyDefaults(true);
        PLUGIN.saveConfig();
        miniMessagesConfig = new MiniMessagesConfig(PLUGIN.getConfig());
    }
}
