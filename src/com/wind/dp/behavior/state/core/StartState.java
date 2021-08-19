package com.wind.dp.behavior.state.core;

/**
 * @author wind
 */
public class StartState implements State {

    @Override
    public void execution(Context context) {
        System.out.println("execution start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
