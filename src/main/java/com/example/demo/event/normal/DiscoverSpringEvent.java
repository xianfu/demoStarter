package com.example.demo.event.normal;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Created by t1003 on 2018/5/2.
 */
@Component
public class DiscoverSpringEvent<String> extends ApplicationEvent {

    private String message;

    public DiscoverSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
        System.out.println("normal event");
    }
    public String getMessage() {
        return message;
    }
}
