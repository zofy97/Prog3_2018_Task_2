public class Sensor {
    boolean active;

    void switchToActive()   {
        if(active != true)  {
            active = true;
            TrafficLight.switchToGreen();
        } else if (active == true) {
            TrafficLight.stayGreen();
        }
    }

    void switchToInactive() {
        if(active != false) {
            active = false;
            TrafficLight.switchToRed();
        } else if (active == false) {
            TrafficLight.stayRed();
        }
    }
}
