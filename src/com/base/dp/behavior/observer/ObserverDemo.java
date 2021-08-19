package com.base.dp.behavior.observer;

import com.base.dp.behavior.observer.core.AppleObserver;
import com.base.dp.behavior.observer.core.OrangeObserver;
import com.base.dp.behavior.observer.core.PearObserver;
import com.base.dp.behavior.observer.core.Subject;

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
