package behavior.memento;

import behavior.memento.core.CareTaker;
import behavior.memento.core.Originator;

public class MementoDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(1);

        CareTaker careTaker = new CareTaker();
        careTaker.add(originator.saveToMemento());

        originator.setState(3);
        System.out.println(originator.getState());
        originator.getFromMemento(careTaker.get(0));
        System.out.println(originator.getState());
    }
}
