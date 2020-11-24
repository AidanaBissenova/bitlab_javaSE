package task25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        double sum=1;
        for(int i=1; i<=n; i++){
            sum*=(a+i-1);
        }
        System.out.println(sum);
    }
}
