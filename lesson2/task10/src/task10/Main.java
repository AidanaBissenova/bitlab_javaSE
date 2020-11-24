package task10;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here.
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>=b && a>=c){
            if(b>=c){
                System.out.println(a-c);
            }
            else if(c>b){
                System.out.println(a-b);
            }
        }
        else if(b>=a && b>=c){
            if(a>=c){
                System.out.println(b-c);
            }
            else if(c>a){
                System.out.println(b-a);
            }
        }
        else{
            if(a>=b){
                System.out.println(c-b);
            }
            else if(b>a){
                System.out.println(c-a);
            }
        }
    }
}
