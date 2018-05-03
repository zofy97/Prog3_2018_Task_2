package Crossing;

/**
 * @Sophie Schauer s0559289
 * This class gets input from the console, and communicates with the sensor.
 */

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
