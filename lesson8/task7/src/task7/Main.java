package task7;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car[] c= new Car[3];
        c[0]= new Car("Toyota", "RAV4", 80, 22000);
        c[1]= new Car("Mers", "200", 120, 27000);
        c[2]= new Car("BMW", "X6", 90, 25000);
        for (int i=0; i<c.length;i++){
            System.out.println(c[i]);
        }
        for (int i=0; i<c.length;i++){
            c[i].ride();
        }
    }
}
