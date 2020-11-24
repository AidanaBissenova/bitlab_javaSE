package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i=0; i<=b; i++){
            System.out.println(Math.pow(a,i));
        }
    }
}
