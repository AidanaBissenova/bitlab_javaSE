package task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int res=1;
        for(int i=1; i<=a;i++){
            res*=i;
        }
        System.out.println(res);
    }
}
