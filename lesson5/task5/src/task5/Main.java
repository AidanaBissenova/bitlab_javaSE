package task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String m= "";
        for (int i=0; i<s1.length(); i++){
            m+=s1.charAt(i);
            m+=s1.charAt(i);
        }
        System.out.println(m);
    }
}
