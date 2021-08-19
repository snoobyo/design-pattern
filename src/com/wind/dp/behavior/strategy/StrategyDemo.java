package com.wind.dp.behavior.strategy;

import com.wind.dp.behavior.strategy.core.AddStrategy;
import com.wind.dp.behavior.strategy.core.Context;
import com.wind.dp.behavior.strategy.core.SubtractStrategy;

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
