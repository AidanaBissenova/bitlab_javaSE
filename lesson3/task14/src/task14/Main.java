package task14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double sum=0;
        double cnt=0;
        while(a!=0){
            sum+=a;
            cnt++;
            a= in.nextInt();
        }
        System.out.println(cnt);
        System.out.println(sum/cnt);
    }
}
