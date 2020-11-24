package task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double sum=0;
        for(double i=1; i<=a; i++){
            double b = 1/i;
            sum+=b;
        }
        System.out.println(sum);
    }
}
