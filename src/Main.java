public class Main {
    //Main Method, Program Entry Point
    public static void main(String[] args){
        printWelcomeMessage();

        //Declare two Accounts
        BankAccount account1 = new BankAccount("Captain Clark", "1001", 10000);
        BankAccount account2 = new BankAccount("Mary Kline", "1002", 5000);


        //Print out starting account information
        System.out.println("Starting Account Information: ");
        printDivider();
        account1.displayAccountInfo();
        printDivider();
        account2.displayAccountInfo();

        System.out.println();
        System.out.println("Processing Transactions...");
        printDivider();

        //Do valid transactions
        account1.deposit(1000);
        account2.withdraw(500);

        //Do invalid transactions
        System.out.println();
        System.out.println("Testing Invalid Transactions:");
        printDivider();

        account1.deposit(-25); //Negative Deposit
        account2.withdraw(-300); //Negative Withdrawal
        account2.withdraw(10000); //Expected Overdraft

        //Show final account information
        System.out.println();
        System.out.println("Final Account Information");
        printDivider();
        account1.displayAccountInfo();
        printDivider();
        account2.displayAccountInfo();
        printDivider();

        System.out.printf("Clark's account balance is $%.2f%n", account1.getBalance());
        System.out.printf("Mary's account balance is $%.2f%n", account2.getBalance());

    }

    //Method to print a divider
    public static void printDivider(){
        System.out.println("----------------------");
    }

    //Method to print a Welcome Message
    public static void printWelcomeMessage() {
        System.out.println("Bank Account Simulator");
        printDivider();
        System.out.println(); //Do an empty return in the console
    }
}
