package vehicle;

public class Engine {
    private String type;
    private double size;

    public Engine(String type, double size){
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }
}
