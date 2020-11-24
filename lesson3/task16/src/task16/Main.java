package task16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=1;
        for(int i=0; i<a; i++){
            sum*=2;
        }
        System.out.println(sum);
    }
}
