package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum=0;
        int arr[][] = new int [n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                arr[i][j]=in.nextInt();
            }
        }for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                    if(arr[i][j]<0){
                        sum++;
                    }
                }
            System.out.println(sum);
            sum=0;
        }

    }
}
