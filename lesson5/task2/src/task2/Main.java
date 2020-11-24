package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s  = in.next();
        int sum=0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)== 'e' || s.charAt(i)=='i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
