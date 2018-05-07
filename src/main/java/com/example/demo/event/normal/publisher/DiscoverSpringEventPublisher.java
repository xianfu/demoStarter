package com.example.demo.event.normal.publisher;

import com.example.demo.event.normal.DiscoverSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by t1003 on 2018/5/2.
 */
@Component
public class DiscoverSpringEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void doStuffAndPublishAnEvent(final String message) {
        System.out.println();
        System.out.println("Publishing event:");
        DiscoverSpringEvent discoverSpringEvent = new DiscoverSpringEvent(this, message);
        applicationEventPublisher.publishEvent(discoverSpringEvent);
    }
}
