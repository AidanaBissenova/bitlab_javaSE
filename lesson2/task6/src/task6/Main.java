package task6;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String branch = in.nextLine();
        if(branch.equals("Science")){
            String subj = in.nextLine();
            if(subj.equals("Math")){
                System.out.println("You are Financier");
            }
            else{
                System.out.println("You are Engineer");
            }
        }
        else if(branch.equals("Humanitarian subjects")){
            String subj = in.nextLine();
            if(subj.equals("History")){
                System.out.println("You are Historic or Diplomat");
            }
            else{
                System.out.println("You are Translator");
            }
        }
        else if(branch.equals("Art")){
            String subj = in.nextLine();
            if(subj.equals("Drawing")){
                System.out.println("You are Painter or Architect");
            }
            else{
                System.out.println("You are Tamada");
            }
        }
        else if(branch.equals("Sport")){
            String subj = in.nextLine();
            if(subj.equals("Team")){
                System.out.println("You are footballer or Basketball player");
            }
            else{
                System.out.println("You are boxer or tennis player");
            }
        }
    }
}
