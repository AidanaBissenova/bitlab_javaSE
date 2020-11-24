package task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
