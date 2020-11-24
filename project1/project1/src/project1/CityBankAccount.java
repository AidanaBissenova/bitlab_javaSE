package project1;

public class CityBankAccount implements BankAccount {
    public String name;
    public String surname;
    public int balance;
    public String accountNumber;
    public String pinCode;
    public CityBankAccount(){}
    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
        balance-=credit;
    }
    public  void debetBalance2(int debet) {
        balance += debet;
    }
    public String accountData2(){
        return name +" " + surname+" "+ balance+" "+accountNumber+" "+pinCode;
    }
}
