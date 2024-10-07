public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(999999, "Albert Coder");

        // Deposit money
        account.deposit(500.00);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200.00);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempt to withdraw more than balance
        account.withdraw(400.00);
        // Print transaction history
        account.printTransactionHistory();
    }
}
