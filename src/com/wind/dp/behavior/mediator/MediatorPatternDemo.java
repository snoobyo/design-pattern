package com.wind.dp.behavior.mediator;

import com.wind.dp.behavior.mediator.core.User;

/**
 * @author wind
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        User yu = new User("yu");
        yu.sendMessage("hello everybody");

        User iu = new User("iu");
        iu.sendMessage("hello");
    }
}
