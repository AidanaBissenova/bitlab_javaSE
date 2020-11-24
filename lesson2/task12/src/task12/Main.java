package task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(abs(c-a) == abs(d-b)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
