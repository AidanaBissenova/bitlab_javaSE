package task20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        int b;
        while (a!=0){
            if(a%10==4 || a%10==7){
                sum++;
            }
            a/=10;
        }
        if(sum == 4 || sum==7){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
