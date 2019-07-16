package com.flydean.listener;

import com.flydean.event.BlackListEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

public class BlackListNotifierAnnotation {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener
    @Order(12)
    public void processBlackListEvent(BlackListEvent event) {
        // notify appropriate parties via notificationAddress...
    }

    @EventListener({ContextStartedEvent.class, ContextRefreshedEvent.class})
    public void handleContextStart() {
    }

    @EventListener(condition = "#blEvent.content == 'my-event'")
    public void processBlackListSPELEvent(BlackListEvent blEvent) {
        // notify appropriate parties via notificationAddress...
    }
}
