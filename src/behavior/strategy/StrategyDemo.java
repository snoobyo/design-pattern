package behavior.strategy;

import behavior.strategy.core.AddStrategy;
import behavior.strategy.core.Context;
import behavior.strategy.core.SubtractStrategy;

/**
 * @author wind
 */
public class StrategyDemo {

    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        context.execute(1, 2);

        context = new Context(new SubtractStrategy());
        context.execute(1, 2);
    }
}
