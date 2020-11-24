package task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        boolean b = false;
        int arr[][] = new int [n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i==j ||  i+j==n-1){
                    System.out.print("x" + " ");
                }
                else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
