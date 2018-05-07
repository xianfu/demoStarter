package com.example.demo.event.order.listener;


import com.example.demo.event.order.OrderEvent;
import com.example.demo.event.order.dto.Order;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by t1003 on 2018/5/2.
 */

@Component
public class OrderListenerTwo implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent event) {
        Order order = (Order)event.getOrder();
        System.out.println("OrderListenerTwo Received spring custom event - " + order.getPrice() );
    }
}
