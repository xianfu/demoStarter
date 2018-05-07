package com.example.demo.event.order;


import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;



/**
 * Created by t1003 on 2018/5/2.
 */
@Component
public class OrderEvent<Order> extends ApplicationEvent {

    private Order order;

    public OrderEvent(Object source, Order order) {
        super(source);
        this.order=order;
        System.out.println("OrderEvent");
    }

    public Order getOrder() {
        return order;
    }
}
