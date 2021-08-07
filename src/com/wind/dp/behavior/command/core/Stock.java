package behavior.command.core;

public class Stock {

    private String name = "A";

    private int quantity = 10;

    public void buy() {
        System.out.println("buy|" + name + "|" +quantity);
    }

    public void sell() {
        System.out.println("sell|" + name + "|" +quantity);
    }
}
