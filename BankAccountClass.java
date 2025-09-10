/* 3. BankAccount Class 
Design a BankAccount class with deposit, withdraw, and balance methods. Add 
overdraft protection. 
Show output for successful and failed transactions. */


public class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amt) { balance += amt; }

    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient Balance");
    }

    void show() {
        System.out.println(name + " Balance: " + balance);
    }
}

class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
        acc.show();
    }
}
