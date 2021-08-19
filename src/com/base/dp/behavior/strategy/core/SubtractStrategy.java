package com.base.dp.behavior.strategy.core;

/**
 * @author wind
 */
public class SubtractStrategy implements Strategy {

    @Override
    public void execute(int num1, int num2) {
        System.out.println("减法：" + (num1 - num2));
    }
}
