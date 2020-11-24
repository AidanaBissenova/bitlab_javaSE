package task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        int b=1;
        for(int i=0; i<a;i++){
            sum+=b;
            b+=2;
        }
        System.out.println(sum);
    }
}
