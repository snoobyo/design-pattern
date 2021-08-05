package behavior.observer;

import behavior.observer.core.AppleObserver;
import behavior.observer.core.OrangeObserver;
import behavior.observer.core.PearObserver;
import behavior.observer.core.Subject;

/**
 * @author wind
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new AppleObserver(subject);
        new OrangeObserver(subject);
        new PearObserver(subject);

        subject.setState(15);
        subject.setState(10);
    }
}
