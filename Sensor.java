package Crossing;

/**
 * @Sophie Schauer s0559289
 * This class is the sensor, which communicates with the traffic light
 */

public class Sensor {
    boolean active;

    public boolean switchToActive()   {
        if(active != true)  {
            active = true;
            TrafficLight.switchToGreen();
            return true;
        } else if (active == true) {
            TrafficLight.stayGreen();
            return true;
        }
        return false;
    }

    public boolean switchToInactive() {
        if(active != false) {
            active = false;
            TrafficLight.switchToRed();
            return false;
        } else if (active == false) {
            TrafficLight.stayRed();
            return false;
        }
        return true;
    }
}
