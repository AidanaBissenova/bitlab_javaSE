package task24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double b = Math.sqrt(2);
        double sum= 0;
        for(double i =0; i<a; i++){
            sum+=Math.sqrt(2+b);
            b=Math.sqrt(2+b);
        }
        System.out.println(sum);
    }
}
