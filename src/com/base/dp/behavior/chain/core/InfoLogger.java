package com.base.dp.behavior.chain.core;

/**
 * @author wind
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("info-logger: " + message);
    }
}
