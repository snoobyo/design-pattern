package com.wind.dp.behavior.chain.core;

/**
 * @author wind
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("error-logger: " + message);
    }
}
