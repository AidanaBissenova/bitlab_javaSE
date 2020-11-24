package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int sum = notEqualZero(arr);
        System.out.println(sum);
    }

    public static int notEqualZero(int arr[]){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] != 0 ){
                sum++;
            }
        }
        return sum;
    }
}
