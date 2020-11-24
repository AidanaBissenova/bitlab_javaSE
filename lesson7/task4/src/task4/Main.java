package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int [n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=in.nextInt();
            }
        }
        int min = minZero(arr);
        System.out.println(min);
    }

    public static int minZero(int arr[][]){
        int sum[] = new int [arr.length];
        for(int i=0;i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i][j]==0){
                    sum[i]++;
                }
            }
        }
        int min = 99999999;
        int b = 0;
        for(int i=0; i<sum.length; i++){
            if(sum[i]<min){
                min = sum[i];
                b=i+1;
            }
        }
        return b;
    }
}
