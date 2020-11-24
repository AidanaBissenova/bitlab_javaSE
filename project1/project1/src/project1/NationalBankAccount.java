package project1;

public class NationalBankAccount implements BankAccount {
    public String fullName;
    public int balance;
    public String accountNumber;
    public String pinCode;
    public NationalBankAccount(){}
    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
    public String getAccountNumber2(){
        return accountNumber;
    }
    public String getPinCode2(){
        return pinCode;
    }
    public void setPinCode2(String pinCode2){
        pinCode=pinCode2;
    }

    public int totalBalance2(){
        return balance;
    }

    public void creditBalance2(int credit){
        balance=balance-credit-200;
    }
    public  void debetBalance2(int debet) {
        balance += debet;
    }
    public String accountData2(){
        return fullName +" "+ balance+" "+accountNumber+" "+pinCode;
    }
}
