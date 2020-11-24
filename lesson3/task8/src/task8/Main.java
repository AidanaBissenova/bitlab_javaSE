package task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double sum=1;
        while (a!=0){
            sum*=a;
            a=in.nextDouble();
        }
        System.out.println(sum);
    }
}
