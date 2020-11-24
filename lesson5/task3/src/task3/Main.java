package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        if(s1.contains(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
