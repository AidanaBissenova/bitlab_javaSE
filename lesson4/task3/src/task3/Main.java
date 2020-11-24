package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int []arr = new int[a];
        int max=0;
        int min=15156155;
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<a; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
