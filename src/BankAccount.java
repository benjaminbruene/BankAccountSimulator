public class BankAccount {
    //Attributes
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    //Constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        //Validate that the balance is positive, or set to zero
        if (balance >= 0){
            this.balance = balance;
        }
        else{
            this.balance = 0;
            System.out.println("Starting balance cannot be negative. Balance set to $0.00");
        }
    }

    //Method to deposit
    public void deposit(double amount){
        //Validate that amount is greater than zero, deposit it and notify the user
        if (amount <= 0){
            System.out.println("Deposit denied: amount must be greater than Zero.");
        } else{
            balance += amount;
            System.out.printf("Deposited $%.2f%n into %s's account.%n", amount, accountHolderName);
        }
    };

    //Method to withdraw
    public void withdraw(double amount){
        //Validate amount is greater than zero and amount has sufficient funds, then tell the user
        if (amount <= 0){
            System.out.println("Withdraw denied: amount must be greater than Zero.");
        } else if(amount > balance){
            System.out.println("Withdraw denied: Insufficient Funds, you poor.");
        } else {
            balance -= amount;
            System.out.printf("Withdrew $%.2f%n from %s's account.%n", amount, accountHolderName);
        }
    }

    //Get Balance (accessor method)
    public double getBalance(){
        return balance;
    }

    //Display Information
    public void displayAccountInfo(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}
