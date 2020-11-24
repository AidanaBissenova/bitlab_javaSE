package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double sum=0;
        double cnt=0;
        int []arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
            cnt++;
            sum+=arr[i];
        }
        System.out.println(sum+ " " + sum/cnt);
    }
}
