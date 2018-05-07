package com.example.demo.event.promotion.listener;


import com.example.demo.event.promotion.PromotionEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by t1003 on 2018/5/2.
 */

@Component
public class PromotionListener implements ApplicationListener<PromotionEvent> {
    @Override
    public void onApplicationEvent(PromotionEvent event) {
        System.out.println("PromotionListener Received spring custom event - " + event.getEventName());
        System.out.println("PromotionListener Received spring custom event - " + event.getPayload());
    }
}
