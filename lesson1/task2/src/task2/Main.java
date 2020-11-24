package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println(Math.pow(x,4)+4*x*Math.pow(y,2)-4*y*z+Math.pow(z,4));
    }
}
