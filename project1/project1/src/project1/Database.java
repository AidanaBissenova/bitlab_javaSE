package project1;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static {

        allAccounts[0] = new CityBankAccount("Ilyas", "Zhuanyshev", 3000, "0102", "KZ010322312");

        allAccounts[1] = new CityBankAccount("Erbol", "Assanbek", 10000, "0101", "KZ010322313");

        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev", 2000, "0102", "KZ0101112");
    }
}
