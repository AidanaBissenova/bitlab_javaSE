package task9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        while(a!=0){
            if(a%2!=0){
                sum+=a;
            }
            a= in.nextInt();
        }
        System.out.println(sum);
    }
}
