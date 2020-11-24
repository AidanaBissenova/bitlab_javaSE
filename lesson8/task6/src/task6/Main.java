package task6;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankApplication bank = new BankApplication("Kaspi", "Almaty");
	// write your code here
        while (true) {
            System.out.println("PRESS [1] TO ADD WORKER");
            System.out.println("PRESS [2] TO LIST WORKERS");
            System.out.println("PRESS [0] TO EXIT");
            int a = in.nextInt();
            if(a==1){
                int id = in.nextInt();
                String name = in.next();
                String surname = in.next();
                String department = in.next();
                int salary = in.nextInt();
                Worker worker = new Worker(id, name, surname, department, salary);
                bank.addWorker(worker);
            }
            else if(a==2){
                bank.listWorkers();
            }
            else{
                break;
            }
        }
    }
}
