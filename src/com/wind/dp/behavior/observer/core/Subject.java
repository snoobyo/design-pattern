package com.wind.dp.behavior.observer.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wind
 */
public class Subject {

    private int state;

    private List<AbstractObserver> observers = new ArrayList<>();

    public void attach(AbstractObserver observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (AbstractObserver observer : observers) {
            observer.update();
        }
    }
}
