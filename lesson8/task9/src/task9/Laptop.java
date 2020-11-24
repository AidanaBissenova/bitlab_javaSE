package task9;

public class Laptop {
    String name;
    int price;
    int weight;
    HDD hardDiskDrive;
    CPU[] cpuMemory;
    public Laptop(){}
    public Laptop(String name, int price, int weight, HDD hardDiskDrive, CPU[] cpuMemory) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.hardDiskDrive = hardDiskDrive;
        this.cpuMemory = cpuMemory;
    }
    public  int getTotalPrice(){
        int b=0;
        for (int i=0; i<cpuMemory.length; i++){
            b+=cpuMemory[i].price;
        }
        return  b+price+hardDiskDrive.price;
    }
    public  int getTotalCPUMemory(){
        int b=0;
        for (int i=0; i<cpuMemory.length; i++){
            b+=cpuMemory[i].cashMemory;
        }
        return b;
    }
    public  int getTotalWeight(){
        int b=0;
        for (int i=0; i<cpuMemory.length; i++){
            b+=cpuMemory[i].weight;
        }
        return b+weight+hardDiskDrive.weight;
    }
}
