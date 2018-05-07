package com.example.demo;

import com.example.demo.event.normal.publisher.DiscoverSpringEventPublisher;

import com.example.demo.event.order.dto.Order;
import com.example.demo.event.order.publisher.OrderEventPublisher;
import com.example.demo.event.promotion.publisher.PromotionEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;


@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		DiscoverSpringEventPublisher bean = context.getBean(DiscoverSpringEventPublisher.class);
		bean.doStuffAndPublishAnEvent("====2abc");

		OrderEventPublisher orderPublish = context.getBean(OrderEventPublisher.class);
		BigDecimal value = new BigDecimal(25);
		Order order = new Order(value);
		orderPublish.doStuffAndPublishAnEvent(order);

		PromotionEventPublisher promotion = context.getBean(PromotionEventPublisher.class);
		String payload = "{\"promotion_uid\":\"123\"}";
		promotion.doStuffAndPublishAnEvent(payload,"lottery");
//		promotion.doStuffAndPublishAnEvent(payload,"gift");
//		promotion.doStuffAndPublishAnEvent(payload,"auction");
	}
}
