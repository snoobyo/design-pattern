package behavior.strategy.core;

/**
 * @author wind
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        strategy.execute(num1, num2);
    }
}
