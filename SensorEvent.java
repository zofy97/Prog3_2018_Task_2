package Crossing;

import java.util.ArrayList;
import java.util.List;

/**
 * @Sophie Schauer s0559289
 * This class communicates with the sensor and the input from the console
 */

public class SensorEvent {
    List<InputEventListener> listenerList = new ArrayList<InputEventListener>();
    Crossing cross = new Crossing();
    public void add(InputEventListener listener)    {
        this.listenerList.add(listener);
    }

    public void remove(InputEventListener listener) {
        this.listenerList.remove(listener);
    }

    public void notify(InputEvent event)    {
        for (InputEventListener listener : listenerList)
            listener.onInputEvent(event);
        if(event.getSource() == "yes")
            cross.s1.switchToActive();
        else if(event.getSource() == "no")
            cross.s1.switchToInactive();
    }
}
