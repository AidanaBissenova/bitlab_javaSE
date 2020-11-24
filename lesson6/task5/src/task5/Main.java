package task5;

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
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(j!=i){
                    if(arr[i][j]==arr[j][i]){
                        b=true;
                    }
                    else{
                        b=false;
                    }
                }
            }
        }
        if(b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
