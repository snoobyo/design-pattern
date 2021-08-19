package com.wind.dp.behavior.command;

import com.wind.dp.behavior.command.core.Broker;
import com.wind.dp.behavior.command.core.BuyStock;
import com.wind.dp.behavior.command.core.SellStock;
import com.wind.dp.behavior.command.core.Stock;

/**
 * @author wind
 */
public class CommandDemo {

    public static void main(String[] args) {
        Broker broker = new Broker();

        broker.addOrder(new BuyStock(new Stock()));
        broker.addOrder(new SellStock(new Stock()));

        broker.executionOrder();
    }
}
