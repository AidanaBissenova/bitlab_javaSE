package task27;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        double sum =1/a;
        for(double i=1; i<=n; i++){
            sum+=(1/Math.pow(a,2*i));
        }
        System.out.println(sum);
    }
}
