package People;

import vehicle.Car;

import java.util.ArrayList;

public class Customer extends Human implements ISell {

    private int money;
    private ArrayList<Car> carsOwned;

    public Customer(String name, int money){
        super(name);
        this.money = money;
        this.carsOwned = new ArrayList<Car>();
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Car> getCarsOwned() {
        return carsOwned;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addCar(Car car) {
        this.carsOwned.add(car);
    }
    public void buyCar(Car car) {
        if (money >= car.getPrice()) {
    money -= car.getPrice();
            carsOwned.add(car);
        }
    }
    public void sell(Dealer dealer, Customer customer, Car car){
        if (dealer.getTill() >= car.getPrice()) {
            int result = dealer.getTill() - (car.getPrice() / 2);
            dealer.setTill(result);
            dealer.addCar(car);
            carsOwned.remove(car);
            money += car.getPrice();
        }

    }
}
