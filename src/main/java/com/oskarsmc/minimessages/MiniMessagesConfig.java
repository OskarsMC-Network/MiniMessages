package com.oskarsmc.minimessages;

import org.bukkit.configuration.file.FileConfiguration;

public class MiniMessagesConfig {
    private final boolean joinEnabled;
    private final String joinMsg;

    private final boolean quitEnabled;
    private final String quitMsg;

    public MiniMessagesConfig(FileConfiguration fileConfiguration) {
        this.joinEnabled = fileConfiguration.getBoolean("join-message.enabled");
        this.joinMsg = fileConfiguration.getString("join-message.message");

        this.quitEnabled = fileConfiguration.getBoolean("quit-message.enabled");
        this.quitMsg = fileConfiguration.getString("quit-message.message");
    }

    public boolean isQuitEnabled() {
        return quitEnabled;
    }

    public boolean isJoinEnabled() {
        return joinEnabled;
    }

    public String getJoinMsg() {
        return joinMsg;
    }

    public String getQuitMsg() {
        return quitMsg;
    }
}
