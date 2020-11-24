package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean b= true;
        int arr[][] = new int [2][n];
        for(int i=0; i<2;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=in.nextInt();
            }
        }
            for (int i = 0; i < n; i++) {
                if (arr[0][i]==arr[1][i]){
                    b=true;
                }
                else{
                    b=false;
                    break;
                }
            }
            if(b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
    }
}
