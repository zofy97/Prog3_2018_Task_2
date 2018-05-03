package Test;

import Crossing.TrafficLight;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Sophie Schauer s0559289
 * This test class tests the traffic light class.
 */

public class TrafficLightTest {

    TrafficLight t1 = new TrafficLight();

    @Test
    public void switchToGreen() {
        assertTrue(t1.switchToGreen() == 0);
    }

    @Test
    public void switchToRed() {
        assertTrue(t1.switchToRed() == 0);
    }

    @Test
    public void stayGreen() {
        assertTrue(t1.stayGreen() == 0);
    }

    @Test
    public void stayRed() {
        assertTrue(t1.stayRed() == 0);
    }
}
