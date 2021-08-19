package com.wind.dp.behavior.memento.core;

public class Originator {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void getFromMemento(Memento memento) {
        state = memento.getState();
    }
}
