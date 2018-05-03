package User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Sophie Schauer s0559289
 * This class implements the Observer class.
 */

public class ConsoleOutput implements Subject {
    List<Observer> observerList = new ArrayList<Observer>();

    int state = 0;
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observerList)  {
            observer.update();
        }
    }

    public int getState()   {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }

    void output()   {
        System.out.println("You are at a crossing.\nIs a car coming?\nyes / no");
    }

    void error()    {
        System.out.println("invalid entry");
    }
}
