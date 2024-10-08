import java.util.ArrayList;
import java.util.List;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Amount(amount, TransactionType.DEPOSIT));
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            this.balance -= amount;
            transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
        }
    }
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account Number: " + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": " + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
