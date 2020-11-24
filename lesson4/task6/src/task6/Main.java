package task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= -44545545;
        int []arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<a; i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}
