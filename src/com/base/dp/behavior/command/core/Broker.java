package com.base.dp.behavior.command.core;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void executionOrder() {
        for (Order order : orders) {
            order.execution();
        }
        orders.clear();
    }
}
