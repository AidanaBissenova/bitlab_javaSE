package task3;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Student[] s = new Student[15];
        int index=0;
        while(true){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");
            int a = in.nextInt();
            if(a==1){
                String name = in.next();
                double gpa= in.nextDouble();
                s[index]= new Student(name, gpa);
                index++;
            }
            else if(a==2){
                for(int i=0; i<index; i++){
                    System.out.println(s[i].name + " "+ s[i].gpa);
                }
            }
            else{
                break;
            }
        }
    }

}
