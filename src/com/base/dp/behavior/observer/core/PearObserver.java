package com.base.dp.behavior.observer.core;

/**
 * @author wind
 */
public class PearObserver extends AbstractObserver {

    public PearObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("pear get: " + subject.getState());
    }
}
