package task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int mul=1;
        int max =0;
        int min = 154455;
        int []arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<a; i++){
            if(arr[i]!=0){
                mul*=arr[i];
            }
        }
        System.out.println(mul);
    }
}
