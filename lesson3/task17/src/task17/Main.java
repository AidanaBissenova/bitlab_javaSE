package task17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        for(int i=1; i<=a; i++){
            sum+=i*i;
        }
        System.out.println(sum);
    }
}
