package com.example.demo.event.normal.listener;

import com.example.demo.event.normal.DiscoverSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by t1003 on 2018/5/2.
 */
@Component
public class DSpringEventListener implements ApplicationListener<DiscoverSpringEvent> {

    @Override
    public void onApplicationEvent(DiscoverSpringEvent event) {
        System.out.println("DSpringEventListener_______d" + event.getMessage());
    }
}
