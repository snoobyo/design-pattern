package com.base.dp.behavior.mediator.core;

import java.util.Date;

/**
 * @author wind
 */
public class ChatRoom {

    public static void sendMessage(User user, String msg) {
        System.out.println(new Date().toString()
                + " [" + user.getUsername() +"] : " + msg);
    }
}
