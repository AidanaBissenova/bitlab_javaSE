package task11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        int start, end;
        boolean isFiratZero = false;
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if(arr[i]==0 && !isFiratZero){
                isFiratZero=true;
            }
            else if(arr[i]==0 && isFiratZero){
                break;
            }
            else if(isFiratZero){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
