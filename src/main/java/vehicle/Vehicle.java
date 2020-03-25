package vehicle;

public abstract class Vehicle {
    private String model;
    private Tyre tyre;
    private Engine engine;


    public Vehicle (String model, Tyre tyre, Engine engine){
        this.model = model;
        this.tyre = tyre;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public Engine getEngine() {
        return engine;
    }
    public double getEngineSize(){
        return this.engine.getSize();
    }
}
