package User;

/**
 * @Sophie Schauer s0559289
 * This interface is for the observer-subject-pattern.
 */

public interface Subject {
    public abstract void addObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyAllObserver();
}
