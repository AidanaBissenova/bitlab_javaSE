package task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
        if(n%2!=0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < (n - 1) / 2) {
                        System.out.print(arr[n / 2 + 1 + i][j] + " ");
                    } else if (i > n / 2) {
                        System.out.print(arr[i / 2 - 1][j] + " ");
                    } else {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < n/ 2) {
                        System.out.print(arr[n / 2 +i][j] + " ");
                    } else {
                        System.out.print(arr[i / 2- (n-1-i)][j] + " ");
                    }
                }
                System.out.println();
            }
        }

    }
}

