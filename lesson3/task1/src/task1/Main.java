package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i=1; i<=a;i++){
            System.out.println(i*i);
        }
    }
}
