package com.wind.dp.behavior.state;

import com.wind.dp.behavior.state.core.Context;
import com.wind.dp.behavior.state.core.StopState;
import com.wind.dp.behavior.state.core.StartState;

/**
 * @author wind
 */
public class StateDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.execution(context);
        System.out.println(context.getState());

        StopState stopState = new StopState();
        stopState.execution(context);
        System.out.println(context.getState());
    }
}

