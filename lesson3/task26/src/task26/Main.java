package task26;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        double b=1;
        double sum =0;
        for (double i=0; i<=n; i++){
            b *= (a+i);
            sum+= 1/b;
        }
        System.out.println(sum);
    }
}
