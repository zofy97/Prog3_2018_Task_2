package Test;

import Crossing.Sensor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @Sophie Schauer s0559289
 * This test class tests the sensor class.
 */

public class SensorTest {

    Sensor s1 = new Sensor();

    @Test
    public void switchToActiveTest()    {
        assertEquals(true, s1.switchToActive());
    }

    @Test
    public void switchToInactive()  {
        assertEquals(false, s1.switchToInactive());
    }
}
