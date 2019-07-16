package com.flydean.listener;

import com.flydean.event.BlackListEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

public class BlackListNotifierAsync {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Async
    @EventListener
    public void processBlackListEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
    }

}
