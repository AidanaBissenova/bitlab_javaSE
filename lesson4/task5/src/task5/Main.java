package task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean b= false;
        int z=0;
        int []arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        int m = in.nextInt();
        for (int i=0; i<a; i++){
            if(arr[i]==m) {
                b=true;
                z=i;
                break;
            }
        }
        if(b){
            System.out.println("Yes" + " " + "Index:"+ z);
        }
        else{
            System.out.println("No");
        }
    }
}
