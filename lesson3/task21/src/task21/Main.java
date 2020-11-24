package task21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int sum=0;
        for(int i=1;i<=w; i++){
            sum+=i*k;
        }
        System.out.println(sum-n);
    }
}
