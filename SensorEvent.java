import javafx.event.Event;
import javafx.event.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class SensorEvent {
    List<InputEventListener> listenerList = new ArrayList<InputEventListener>();
    public void add(InputEventListener listener)    {
        this.listenerList.add(listener);
    }

    public void remove(InputEventListener listener) {
        this.listenerList.remove(listener);
    }

    public void notify(InputEvent event)    {
        for (InputEventListener listener : listenerList)
            listener.onInputEvent(event);
    }
}
