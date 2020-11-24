package task1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int []arr = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = in.nextInt();
        }
        for (int i=9; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
