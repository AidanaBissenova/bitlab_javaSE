package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String m ="";
        for(int i=s.length()-1; i>=0; i--){
            m+=s.charAt(i);
        }
        if(m.equals(s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
