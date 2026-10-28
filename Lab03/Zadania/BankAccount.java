package Lab03;

public class BankAccount{
    private String owner;
    private double balance;

    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public void getOwner(){
        System.out.println(owner);
    }
    public void getBalance(){
        System.out.println(balance);
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Nowy balans: " + balance );
        }
    }
    public void withdraw(double amount){
        if(amount>0 && balance>= amount){
            balance -= amount;
        }
    }
}
