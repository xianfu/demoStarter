package com.example.demo.event.order.dto;

import java.math.BigDecimal;

/**
 * Created by t1003 on 2018/5/2.
 */

public class Order {

    public Order(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private BigDecimal price;
}
