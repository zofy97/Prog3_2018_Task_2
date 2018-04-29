import java.util.EventListener;

public class TrafficLightListener implements InputEventListener {
    Crossing cross = new Crossing();

    public void onInputEvent(InputEvent event) {
        if(event.equals("yes")) {
            cross.s1.switchToActive();
        } else if (event.equals("no"))  {
            cross.s1.switchToInactive();
        }
    }
}
