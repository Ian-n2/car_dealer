package vehicle;

public class Car extends Vehicle {
    private int price;
    private String colour;
    private int damage;

    public Car (String model, Tyre tyre, Engine engine, int price, String colour, int damage){
        super (model, tyre, engine);
        this.price = price;
        this.colour = colour;
        this.damage = damage;
    }

    public int getPrice() {
        return price - damage;
    }

    public String getColour() {
        return colour;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
