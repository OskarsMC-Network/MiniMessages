package com.oskarsmc.minimessages;

public class MiniMessagesConfig {
    private final boolean joinEnabled;
    private final String joinMsg;

    private final boolean quitEnabled;
    private final String quitMsg;

    public MiniMessagesConfig(boolean joinEnabled, String joinMsg, boolean quitEnabled, String quitMsg) {
        this.joinEnabled = joinEnabled;
        this.joinMsg = joinMsg;

        this.quitEnabled = quitEnabled;
        this.quitMsg = quitMsg;
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
