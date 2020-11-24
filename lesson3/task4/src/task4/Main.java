package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double sum=0;
        int cnt=0;
        while (a!=0){
            cnt++;
            sum+=a;
            a = in.nextInt();
        }
        System.out.println(cnt);
        System.out.println(sum/cnt);
    }
}
