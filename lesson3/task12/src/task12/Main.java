package task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i=1; i<=a; i++){
            if(a%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
