package com.oskarsmc.minimessages;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;

public class ConfigManager {
    private static final MiniMessages plugin = MiniMessages.getPlugin(MiniMessages.class);
    private static final MiniMessage miniMessage = MiniMessage.get();
    private static MiniMessagesConfig miniMessagesConfig;

    public static Component getJoinMessage(String playerName) {
        return miniMessage.parse(miniMessagesConfig.getJoinMsg().replace("$player$", playerName));
    }

    public static Component getQuitMessage(String playerName) {
        return miniMessage.parse(miniMessagesConfig.getJoinMsg().replace("$player$", playerName));
    }

    public static MiniMessagesConfig getMiniMessagesConfig() {
        return miniMessagesConfig;
    }

    public static void reloadConfig() {
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveConfig();
        miniMessagesConfig = new MiniMessagesConfig(
                plugin.getConfig().getBoolean("join-message.enabled"),
                plugin.getConfig().getString("join-message.message"),
                plugin.getConfig().getBoolean("quit-message.enabled"),
                plugin.getConfig().getString("quit-message.message")
        );
    }
}
