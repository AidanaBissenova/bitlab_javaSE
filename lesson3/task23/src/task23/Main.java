package task23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 1;
        for (double i=1; i<=n; i++){
            sum*=(1+(1/(i*i)));
        }
        System.out.println(sum);
    }
}
