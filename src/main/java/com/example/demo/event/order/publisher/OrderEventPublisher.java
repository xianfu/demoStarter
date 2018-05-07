package com.example.demo.event.order.publisher;


import com.example.demo.event.order.OrderEvent;
import com.example.demo.event.order.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * Created by t1003 on 2018/5/2.
 */
@Component
public class OrderEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void doStuffAndPublishAnEvent(final Order order) {
        System.out.println();
        System.out.println("Publishing OrderEventPublisher doStuffAndPublishAnEvent event. ");
        OrderEvent<Order> orderEvent = new OrderEvent(this, order);
        applicationEventPublisher.publishEvent(orderEvent);
    }
}
