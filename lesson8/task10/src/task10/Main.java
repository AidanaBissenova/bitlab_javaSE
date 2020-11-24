package task10;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User[] users = new User[3];
        users[0] = new User(1, "Aidana", "aasa", "us");
        users[1] = new User(2, "Azhar", "baasa", "us");
        users[2] = new User(3, "Assyl", "maasa", "us");
        for (int i=0; i< users.length; i++){
            System.out.println(users[i]);
        }
    }
}
