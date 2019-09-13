package part1;
import static org.junit.Assert.*;

import org.junit.Test;

public class RoadTest {
    @Test public void testGetRoadLength(){
        Road road = new Road();
        road.setRoadLength(5);
        assertEquals(5, road.getRoadLength());
    }
    @Test public void testNewRoad(){
        Road road = new Road();
        road.newRoad();
        assertEquals(2, road.getRoadNumber());
    }
}
