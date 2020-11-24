package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int max=0;
        int min=99999999;
        double sum=0;
        double cnt=0;
        int []arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<a; i++){
            cnt++;
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        cnt-=2;
        sum= sum-max-min;
        System.out.println(sum + " " +sum/cnt);
    }
}
