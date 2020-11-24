package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int v = in.nextInt();
        int max= findMax(n,m,v);
        System.out.println(max);
    }

    public static int findMax(int a, int b, int c){
        if(a>b){
            if(a>c) return a;
            return c;
        }
        else{
            if(b>c) return b;
            return c;
        }
    }
}
