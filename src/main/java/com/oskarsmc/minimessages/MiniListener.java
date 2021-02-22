package com.oskarsmc.minimessages;

import net.kyori.adventure.text.serializer.bungeecord.BungeeComponentSerializer;
import net.kyori.adventure.text.serializer.craftbukkit.BukkitComponentSerializer;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MiniListener implements Listener {
    private static final BungeeComponentSerializer bungeeComponentSerializer = BungeeComponentSerializer.get();
    private static final LegacyComponentSerializer legacyComponentSerializer = BukkitComponentSerializer.legacy();

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        if (ConfigManager.getMiniMessagesConfig().isJoinEnabled()) {
            event.setJoinMessage(legacyComponentSerializer.serialize(ConfigManager.getJoinMessage(event.getPlayer().getName())));
        }
    }

    @EventHandler
    public void PlayerQuitEvent(PlayerQuitEvent event) {
        if (ConfigManager.getMiniMessagesConfig().isQuitEnabled()) {
            event.setQuitMessage(legacyComponentSerializer.serialize(ConfigManager.getQuitMessage(event.getPlayer().getName())));
        }
    }
}
