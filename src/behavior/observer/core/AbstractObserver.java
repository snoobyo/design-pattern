package behavior.observer.core;

/**
 * @author wind
 */
public abstract class AbstractObserver {

    protected Subject subject;

    public abstract void update();
}
