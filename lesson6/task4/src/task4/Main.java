package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        int arr[][] = new int [n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    System.out.print("x ");
                }
                else
                    System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
