package task15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b=0;
        while(a!=0){
            if(a>b){
                b=a;
            }
            a= in.nextInt();
        }
        System.out.println(b);
    }
}
