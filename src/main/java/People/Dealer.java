package People;

import vehicle.Car;

import java.util.ArrayList;

public class Dealer extends Human implements ISell {
    private int till;
    private ArrayList<Car> stock;

    public Dealer(String name, int till){
        super(name);
        this.till = till;
        this.stock = new ArrayList<Car>();
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setTill(int till) {
        this.till = till;
    }


    public void addCar(Car car){
        stock.add(car);
    }
    public void sell(Dealer dealer, Customer customer ,Car car){
        if (customer.getMoney() >= car.getPrice()) {
            int result = customer.getMoney() - car.getPrice();
            customer.setMoney(result);
            customer.addCar(car);
            stock.remove(car);
            till += car.getPrice();
        }

    }

    public void buyCar(Car car) {
        if (till >= car.getPrice()) {
            till -= car.getPrice();
            stock.add(car);
        }
    }

    public void fixCar(Car car){
        till -= car.getDamage();
        car.setDamage(0);
    }

}

