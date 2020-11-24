package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int res=0;
        for(int i=1; i<=b; i++){
            res+=a;
        }
        System.out.println(res);
    }
}
