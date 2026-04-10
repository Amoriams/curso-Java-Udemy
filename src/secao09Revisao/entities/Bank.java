package secao09Revisao.entities;

public class Bank {

    private int NumAccount;
    private String name;
    private double balance;



    public Bank(int NumAccount, String name){
        this.NumAccount = NumAccount;
        this.name = name;

    }

    public Bank(int NumAccount, String name, double InitialDep){
        this.NumAccount = NumAccount;
        this.name = name;
        deposit(InitialDep);

    }

    public int getNumAccount() {
        return NumAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }




    public void deposit(double deposit){
        balance += deposit;
    }

    public void withdraw(double withdraw){
        balance -= withdraw + 5;
    }


    public String toString() {
        return "Account: " + NumAccount +
                ", Holder: " + name +
                ", Balance:" + balance;
    }
}


