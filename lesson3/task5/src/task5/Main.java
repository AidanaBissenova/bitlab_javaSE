package task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c=0;
        while (a!=0){
            if(a>c){
                c=a;
            }
            a = in.nextInt();
        }
        System.out.println(c);
    }
}
