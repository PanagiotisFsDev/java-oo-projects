package bankApp;

import bankApp.model.overdraftAccount;
import bankApp.model.jointAccount;

public class Main {
    public static void main(String[] args) {
        // Create two overdraft accounts
        overdraftAccount account1 = new overdraftAccount(1, "GR123", "Panagiotis", "Papadopoulos", "123!@", 1000.0, 500.0);
        overdraftAccount account2 = new overdraftAccount(2, "GR456", "Giorgos", "Nikolaidis", "456!@", 2000.0, 1000.0);

        // Deposit and withdraw from the first account
        try {
            account1.deposit(500);
            System.out.println("Account 1 balance after deposit: " + account1.getBalance());

            boolean withdrawSuccess = account1.withdraw(1600);
            System.out.println("Attempt to withdraw $1600 from Account 1: " + (withdrawSuccess ? "Successful transaction" : "Failed transaction"));
            System.out.println("Account 1 balance after withdrawal: " + account1.getBalance());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Create a joint account and add the two accounts as holders
        jointAccount jointAcc = new jointAccount("GR789");
        jointAcc.addFirstHolder(account1);
        jointAcc.addSecondHolder(account2);

        // Test joint account holders and their balances
        overdraftAccount holder1 = jointAcc.getFirstHolder();
        overdraftAccount holder2 = jointAcc.getSecondHolder();

        if (holder1 != null && holder2 != null) {
            System.out.println("\nJoint Account Holders:");
            System.out.println("Holder 1: " + holder1.getFirstname() + " " + holder1.getLastname() + " - Balance: " + holder1.getBalance());
            System.out.println("Holder 2: " + holder2.getFirstname() + " " + holder2.getLastname() + " - Balance: " + holder2.getBalance());
        } else {
            System.out.println("\nInvalid joint account holders.");
        }
    }
}
