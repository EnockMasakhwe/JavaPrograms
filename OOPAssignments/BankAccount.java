package OOPAssignments;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
        String customerName;
        String accountNumber;
        double balance;

        public Account(String customerName, String accountNumber, double balance) {
            this.customerName = customerName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }      
        public String getAccountNumber() {
            return accountNumber;
        }   
        public double getBalance() {
            return balance;
        }   

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount + " account number" + accountNumber);
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + " from account number" + accountNumber);
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        @Override
        public String toString() {
            return "Customer Name: " + customerName + ", Account Number: " + accountNumber + ", Balance: " + balance;
        }
    
}

class Bank{
    ArrayList<Account> accounts = new ArrayList();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("\nAccount added successfully!");
    }

    public void removeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("\nAccount removed successfully!");
                return;
            }
        }
        System.out.println("\nAccount with number " + accountNumber + " not found!");
    }

    public void displayAccounts() {
        System.out.println("==== Bank Accounts ====");

        if (accounts.isEmpty()) {
            System.out.println("\nNo accounts available!");
            return;
        }else{
            for(Account account : accounts) {
                System.out.println(account);
            }
        }
        
    }

    public void depositToAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("\nAccount with number " + accountNumber + " not found!");
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("\nAccount with number " + accountNumber + " not found!");
    }

}

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        int choice;
        do {
            System.out.println("\n==== Bank Menu ====");
            System.out.println("1. Add Account");       
            System.out.println("2. Remove Account");
            System.out.println("3. Display Accounts");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("\nEnter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();

                    Account newAccount = new Account(name, accNumber, balance);
                    bank.addAccount(newAccount);
                    break;
                case 2:
                    System.out.print("\nEnter account number to remove: ");
                    String accNumToRemove = scanner.nextLine();
                    bank.removeAccount(accNumToRemove);
                    break;
                case 3:
                    bank.displayAccounts();
                    break;
                case 4:
                    System.out.print("\nEnter account number to deposit to: ");
                    String accNumToDeposit = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.depositToAccount(accNumToDeposit, depositAmount);
                    break;
                case 5:
                    System.out.print("\nEnter account number to withdraw from: ");
                    String accNumToWithdraw = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdrawFromAccount(accNumToWithdraw, withdrawAmount);
                    break;
                case 6:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        } while (choice != 6);  
        scanner.close();
    }
    
}