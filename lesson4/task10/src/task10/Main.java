package task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int max =0;
        double sum =0;
        double cnt =0;
        int min = 154455;
        int []arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        int m= in.nextInt();
        for(int i=0; i<a; i++){
            if(arr[i]>m){
                sum+=arr[i];
                cnt++;
            }
        }
        System.out.println(sum/cnt);
    }
}
