package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt();
        String v = in.next();
        if(v.equals("USD")){
            a/=420;
            System.out.println(a+" USD");
        }
        else if(v.equals("EUR")){
            a/=490;
            System.out.println(a+" EUR");
        }
        else{
            a/=550;
            System.out.println(a+" GBR");
        }
    }
}
