package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String m = "";
        for (int i=s1.length()-1; i>=0; i--){
            m+=s1.charAt(i);
        }
        if(s2.equals(m)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
