package part1;
import static org.junit.Assert.*;

import org.junit.Test;

public class TrafficLightTest {
    @Test public void testTrafficLightColour(){
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setLightColour("green");
        assertEquals("green", trafficLight.getLightColour());
    }
}
