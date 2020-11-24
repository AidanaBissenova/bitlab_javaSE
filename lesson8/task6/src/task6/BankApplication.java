package task6;
import java.util.Scanner;
public class BankApplication {
    Scanner in = new Scanner(System.in);
    String name;
    String country;
    Worker []workers = new Worker[100]; //Для данного поля геттер и сеттер запрещен
    int sizeOfWorkers; // Для данного поля геттер и сеттер запрещен, он работает как счетчик.
    public BankApplication(){}
    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public void addWorker(Worker worker){
        workers[sizeOfWorkers]=worker;
        sizeOfWorkers++;
    }
    public void listWorkers(){
        for (int i=0; i<sizeOfWorkers; i++){
            System.out.println(workers[i]);
        }
    }
}
