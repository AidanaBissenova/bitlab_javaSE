package task5;

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
        arrReturn(arr);

    }

    public static void arrReturn(int arr[][]){
        int sum1[]= new int[arr.length];
        int sum2[] = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                if(i==arr.length-1){
                    sum1[i]=arr[arr.length-1][j];
                }
                else if(i==0) {
                    sum2[i] = arr[0][j];
                }
                else System.out.print(arr[i][j]+ " ");
            }
        }
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                if(i==arr.length-1){
                    System.out.print(sum2[i]+ " ");
                }
                else if(i==0){
                    System.out.print(sum1[i]+ " ");
                }
                else System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
