package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int m = sumString(s);
        System.out.println(m);
    }

    public static int sumString(String s){
        int sum = 0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)==65 || s.charAt(i)==69 || s.charAt(i)==73 || s.charAt(i)==79 || s.charAt(i)==85 || s.charAt(i)==89 || s.charAt(i)==97 ||s.charAt(i)==101 || s.charAt(i)==105 || s.charAt(i)==111 || s.charAt(i)==117 || s.charAt(i)==121){
                sum++;
            }
        }
        return sum;
    }
}
