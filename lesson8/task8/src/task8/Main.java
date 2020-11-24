package task8;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int b=0;
        Engine[] e = new Engine[3];
        e[0]= new Engine("DDD", 25, 36, 3);
        e[1]= new Engine("MM", 31, 23, 2);
        e[2]= new Engine("H", 15, 15, 5);

        Car[] c= new Car[6];
        c[0]= new Car("Toyota", "RAV4", 80, 2, e[0]);
        c[1]= new Car("Mers", "200", 120, 27000, e[1]);
        c[2]= new Car("BMW", "X6", 90, 25000, e[1]);
        c[3]= new Car("model", "R5", 80, 22000,e[2]);
        c[4]= new Car("this", "LL20", 120, 27000, e[2]);
        c[5]= new Car("notbmw", "X6", 90, 25000, e[0]);
        for(int i=0; i<c.length; i++){
            b +=c[i].totalWeight();
        }
        System.out.println(b);
    }
}
