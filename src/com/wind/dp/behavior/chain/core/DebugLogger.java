package com.wind.dp.behavior.chain.core;

/**
 * @author wind
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("debug-logger: " + message);
    }
}
