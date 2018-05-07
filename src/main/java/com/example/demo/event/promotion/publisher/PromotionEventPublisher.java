package com.example.demo.event.promotion.publisher;


import com.example.demo.event.promotion.PromotionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by t1003 on 2018/5/2.
 */
@Component
public class PromotionEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void doStuffAndPublishAnEvent(final String payload,final String eventName) {
        System.out.println();
        System.out.println("Publishing PromotionEventPublisher doStuffAndPublishAnEvent event. ");
        PromotionEvent promotionEvent = new PromotionEvent(this,payload, eventName);
        applicationEventPublisher.publishEvent(promotionEvent);
    }
}
