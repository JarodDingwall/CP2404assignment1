package part1;
import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {
    @org.junit.Test
    public void testGetPosition(){
        Car car = new Car();
        car.setPosition(1);
        assertEquals(1,car.getPosition());
    }
    @Test public void testCarMove(){
        Car car = new Car();
        car.carMove();
        assertEquals(1, car.getPosition());
    }

}
