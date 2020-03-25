import People.Customer;
import People.Dealer;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Engine;
import vehicle.Tyre;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Dealer dealer;
    Customer pete;
    Tyre tyre;
    Engine petrol;
    Engine bats;
    Car polo;
    Car icar;

    @Before
    public void before() {
        dealer = new Dealer("Ian", 2300);
        pete = new Customer("Pete", 7000);
        tyre = new Tyre("med");
        petrol = new Engine("Petrol", 1.4);
        bats = new Engine("Battary", 0.5);
        polo = new Car("Polo", tyre, petrol, 2000, "Black", 0);
        icar = new Car("AppleCar", tyre, bats, 6000, "White", 200);
        dealer.addCar(icar);
        pete.addCar(polo);
    }

    @Test
    public void CanSellCar() {
        pete.sell(dealer, pete, polo);
        assertEquals(1300, dealer.getTill());
        assertEquals(9000,pete.getMoney());
    }
}
