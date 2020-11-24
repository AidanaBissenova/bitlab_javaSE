package task8;

public class Car {
    String name;
    String model;
    int speed;
    int weight;
    Engine engine;
    public Car(){}
    public Car(String name, String model, int speed, int weight, Engine engine) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.weight = weight;
        this.engine = engine;
    }
    public String toString(){
        return name+ " "+model+ " "+speed+" "+weight+ " "+engine;
    }
    public void ride(){
        System.out.println("A car " + name + " and " + model + "is riding with speed "+ speed +" " + weight +" and " + engine);
    }
    public int totalWeight(){
        int w =weight+engine.weight;
        return w;
    }
}
