package task11;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        User[] users = new User[3];
        users[0] = new User(1, "Aidana", "aasa", "us");
        users[1] = new User(2, "Azhar", "baasa", "us");
        users[2] = new User(3, "Assyl", "maasa", "us");
        System.out.println("INSERT LOGIN:");
        String login2 = in.next();
        for (int i=0; i<users.length; i++){
            if(users[i].login.equals(login2)){
                String password2 = in.next();
                if(users[i].password.equals(password2)){
                    while(true) {
                        System.out.println("Welcome " + users[i].login);
                        System.out.println("PRESS [1] TO EDIT LOGIN");
                        System.out.println("PRESS [2] TO CHANGE PASSWORD");
                        System.out.println(" PRESS [3] TO LIST USERS");
                        System.out.println("PRESS [0] TO EXIT");
                        int a = in.nextInt();
                        if (a == 1) {
                            String login3 = in.next();
                            users[i].login = login3;
                        }
                        else if(a == 2){
                            System.out.println(" Insert old password");
                            String password3 = in.next();
                            if(users[i].password.equals(password3)){
                                System.out.println("Insert new password");
                                String password4 = in.next();
                                System.out.println(" Re-Insert new password");
                                String password5 = in.next();
                                if (password4.equals(password5)){
                                    users[i].password=password5;
                                }
                            }
                        }
                        else if(a==3){
                            for(int j=0; j<users.length; j++){
                                System.out.println(users[j]);
                            }
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
    }
}
