package task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String m="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                m+=s.substring(i,i+1).toLowerCase();
            }
            else{
                m+=s.substring(i,i+1).toUpperCase();
            }
        }
        System.out.println(m);
    }
}
