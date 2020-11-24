package task18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        while (a!=0){
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}
