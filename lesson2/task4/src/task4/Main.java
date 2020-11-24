package task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login = in.next();
        String password = in.next();
        if(login.equals("user") && password.equals("qwerty")){
            System.out.println("Authentication completed");
        }
        else{
            System.out.println("Invalid login or password");
        }
    }
}
