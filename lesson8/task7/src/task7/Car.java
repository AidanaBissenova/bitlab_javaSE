package task7;

public class Car {
    String name;
    String model;
    int speed;
    int weight;
    public Car(){}
    public Car(String name, String model, int speed, int weight) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.weight = weight;
    }
    public String toString(){
        return name+ " "+model+ " "+speed+" "+weight;
    }
    public void ride(){
        System.out.println("A car " + name + " and " + model + "is riding with speed "+ speed +" " + weight);
    }
}
