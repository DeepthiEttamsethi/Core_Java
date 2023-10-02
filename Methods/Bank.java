package Methods;

public class Bank {
    
    private int currentBalance = 1000; // Make currentBalance instance variable instead of static
    
    public static void greetCustomer() {
        System.out.println("Hello, Welcome to banking application");
    }
    
    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Amount is deposited successfully");
    }
    
    public void withdrawal(int amount) { // Corrected the method name to withdrawal
        if (amount <= currentBalance) {
            currentBalance = currentBalance - amount;
            System.out.println("Amount is withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public int getCurrentBalance() {
        return currentBalance;
    }
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        greetCustomer();
        System.out.println("Current balance is: " + bank.getCurrentBalance());
        bank.deposit(500);
        System.out.println("Current balance is: " + bank.getCurrentBalance());
        bank.withdrawal(300); // Corrected method name and added a withdrawal call
        
        System.out.println("Updated balance is: " + bank.getCurrentBalance()); // Display the updated balance
    }
}
