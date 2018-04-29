import java.util.ArrayList;
import java.util.List;

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

    void trafficOutput()    {

    }
}
