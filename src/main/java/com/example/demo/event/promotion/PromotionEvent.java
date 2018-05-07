package com.example.demo.event.promotion;


import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


/**
 * Created by t1003 on 2018/5/2.
 */
@Component
public class PromotionEvent<String> extends ApplicationEvent {


    private String payload;

    private String eventName;

    public PromotionEvent(Object source, String payload,String eventName) {
        super(source);
        this.payload=payload;
        this.eventName=eventName;
        System.out.println("PromotionEvent");
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
