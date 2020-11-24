package project1;
import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Enter your  account number: ");
        String acc = in.next();
        System.out.println("Enter your password: ");
        String pass = in.next();
        for(int i=0; i<Database.allAccounts.length; i++){
            if((Database.allAccounts[i].getAccountNumber2().equals(acc)) && (Database.allAccounts[i].getPinCode2().equals(pass))){
                if(Database.allAccounts[i] instanceof CityBankAccount) {
                    while (true) {
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("PRESS [2] TO VIEW BALANCE");
                        System.out.println("PRESS [3] TO CHANGE PIN CODE");
                        System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                        System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                        System.out.println("PRESS [6] TO EXIT");
                        int num1 = in.nextInt();
                        if (num1 == 1) {
                            System.out.println("Enter the amount you want to withdraw: ");
                            int credit = in.nextInt();
                            Database.allAccounts[i].creditBalance2(credit);
                        } else if (num1 == 2) {
                            System.out.println(Database.allAccounts[i].totalBalance2());
                        } else if (num1 == 3) {
                            System.out.println("Enter new pinCode: ");
                            String newpin = in.next();
                            Database.allAccounts[i].setPinCode2(newpin);
                        } else if (num1 == 4) {
                            System.out.println("Enter the amount you want to add: ");
                            int debet = in.nextInt();
                            Database.allAccounts[i].debetBalance2(debet);
                        } else if (num1 == 5) {
                            System.out.println(Database.allAccounts[i].accountData2());
                        } else {
                            break;
                        }
                    }
                }
                if(Database.allAccounts[i] instanceof NationalBankAccount){
                    while(true){
                        System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                        System.out.println("PRESS [2] TO VIEW BALANCE");
                        System.out.println("PRESS [3] TO EXIT");
                        int num1 = in.nextInt();
                        if (num1 == 1) {
                            System.out.println("Enter the amount you want to withdraw: ");
                            int credit = in.nextInt();
                            Database.allAccounts[i].creditBalance2(credit);
                        }
                        else if (num1 == 2) {
                            System.out.println(Database.allAccounts[i].totalBalance2());
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
