package task19;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int x;
        for(int i=0; i<1000; i++){
            if((a*Math.pow(i,3)+b*Math.pow(i,2)+c*i+d)==0){
                System.out.print(i + " ");
            }
        }
    }
}
