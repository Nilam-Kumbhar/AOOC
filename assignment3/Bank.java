class BankAccount { 
     double balance; 
     BankAccount(double initialBalance) { 
        balance = initialBalance; 
    } 
     void deposit(double amount) { 
        balance = balance + amount; 
        System.out.println("Deposited: " + amount); 
    } 
     void withdraw(double amount) { 
        if (balance >= amount) { 
            balance = balance - amount; 
            System.out.println("Withdrawn: " + amount); 
        } else { 
            System.out.println("Insufficient balance!"); 
        } 
    } 
    void displayBalance() { 
        System.out.println("Current Balance: " + balance); 
    } 
} 
class SavingsAccount extends BankAccount { 
    SavingsAccount(double initialBalance) { 
        super(initialBalance); 
    } 
     void withdraw(double amount) { 
        if (balance - amount < 100) { 
            System.out.println("Withdrawal denied! Minimum balance of $100 required."); 
        } else { 
            balance = balance - amount; 
            System.out.println("Withdrawn: " + amount); 
        } 
    } 
} 
 
public class Bank { 
    public static void main(String[] args) { 
        SavingsAccount myAccount = new SavingsAccount(500); 
        myAccount.displayBalance(); 
        myAccount.deposit(200); 
        myAccount.withdraw(550); 
        myAccount.withdraw(50); 
        myAccount.displayBalance(); 
    } 
}  