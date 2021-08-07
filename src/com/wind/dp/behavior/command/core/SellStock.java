package behavior.command.core;

public class SellStock implements Order{

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execution() {
        stock.sell();
    }
}
