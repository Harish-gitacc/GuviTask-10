package task10;

import java.util.Scanner;

public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two argument
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } 
        else 
        {
            System.out.println("Insufficient balance");
        }
    }

    // Method to show total balance
    public void showBalance() {
        System.out.println("Total Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting input for initial balance
        System.out.print("Enter initial balance: $");
        double initialBalance = sc.nextDouble();

        // Creating an Account object
        Account account = new Account(initialBalance);

        // Menu for transactions
        boolean continueTransactions = true;
        while (continueTransactions)
        {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.showBalance();
                    break;
                case 4:
                    continueTransactions = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

OUTPUT:
Enter initial balance: $1000

1. Deposit
2. Withdraw
3. Show Balance
4. Exit
Enter your choice: 1
Enter deposit amount: $500
Deposited: $500.0

1. Deposit
2. Withdraw
3. Show Balance
4. Exit
Enter your choice: 2
Enter withdrawal amount: $200
Withdrawn: $200.0

1. Deposit
2. Withdraw
3. Show Balance
4. Exit
Enter your choice: 3
Total Balance: $1300.0
1. Deposit
2. Withdraw
3. Show Balance
4. Exit
Enter your choice: 4
Exiting...
