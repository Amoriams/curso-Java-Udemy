package entities;

public class Account {
    public String owner;
    public int balance;


    public String message(){

        if (balance < 0) {
           return "your balance is negative, you must go to the bank to clear your debts";
        } else if (balance == 0){
            return "Your balance is 0, shall we deposit?";
        }else {
            return "congruatulations, Ms./Mr. " + owner + " your balance is positive";
        }
    }
}


