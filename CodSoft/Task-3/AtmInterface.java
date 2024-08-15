import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite of " + amount + " Successful.Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposite amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " Sucessful. Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class ATM {
    private BankAccount bankaccount;

    public ATM(BankAccount bankaccount) {
        this.bankaccount = bankaccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposite");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performTransaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.println("Current balance: " + bankaccount.getBalance());
                break;
            case 2:
                System.out.println("Enter deposite amount: ");
                double depositeAmount = scanner.nextDouble();
                bankaccount.deposite(depositeAmount);
                break;
            case 3:
                System.out.println("Enter withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                bankaccount.withdraw(withdrawalAmount);
                break;
            case 4:
                System.out.println("Exiting Atm.Thank you!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                break;
        }
    }
}

public class AtmInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial account balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount bankaccount = new BankAccount(initialBalance);

        ATM atm = new ATM(bankaccount);

        while (true) {
            atm.displayMenu();
            System.out.println("Select an option: ");
            int choice = scanner.nextInt();

            atm.performTransaction(choice, scanner);
        }
    }
}
