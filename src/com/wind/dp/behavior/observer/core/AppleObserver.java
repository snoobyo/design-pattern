package behavior.observer.core;

/**
 * @author wind
 */
public class AppleObserver extends AbstractObserver {

    public AppleObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("apple get: " + subject.getState());
    }
}
