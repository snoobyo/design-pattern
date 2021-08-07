package behavior.command;

import behavior.command.core.Broker;
import behavior.command.core.BuyStock;
import behavior.command.core.SellStock;
import behavior.command.core.Stock;

public class CommandDemo {

    public static void main(String[] args) {
        Broker broker = new Broker();

        broker.addOrder(new BuyStock(new Stock()));
        broker.addOrder(new SellStock(new Stock()));

        broker.executionOrder();
    }
}
