import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Engine;
import vehicle.Tyre;
import vehicle.Vehicle;

import static junit.framework.TestCase.assertEquals;

public class CarTest {
    Tyre tyre;
    Engine engine;
    Car car;
    @Before
    public void before(){
        tyre = new Tyre("small");
        engine = new Engine("petrol",1.2);
        car = new Car("polo",tyre,engine, 1000, "blue", 100);

    }
    @Test
    public void canGetModel(){
        assertEquals("polo", car.getModel());
    }
    @Test
    public void canGetEngineSize(){
        assertEquals(1.2, car.getEngineSize(), 0.01);
    }
    @Test
    public void ›CanGetColour(){
        assertEquals("blue", car.getColour());
    }
    @Test
    public void canGetPrice(){
        assertEquals(900, car.getPrice());
    }
}

