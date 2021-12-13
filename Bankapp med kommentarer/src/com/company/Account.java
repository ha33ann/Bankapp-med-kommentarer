package com.company;


import java.util.UUID;

//Detta är min State
public class Account {
    private UUID accNr;
    private int Balance;
    private String Banktype;
    private int deposit;

//Detta är min Constructor
    //Detta anger informationen hos en account såsom account nummer, balance och vilken typ av bank de har
public Account(){
    accNr = accNr;
    Balance = 0;
    Banktype = "Debit";

}
//Detta är min Behaviour
    //Detta returnerar balance hos en account
    public int getBalance() {
        return Balance;
    }

    //Detta är metoden för deposit
    public boolean Deposit(int amount){
    Balance = Balance + amount;
    return true;
    }

    //Detta är metoden för withdraw
    public boolean Withdraw(int amount) {
        if (amount > Balance) {
            return false;
        } else {
            Balance = Balance - amount;
            return true;
        }
    }

    //Detta är informationen om account (Current balance)
    public String Accountinfo(){
    String accinfo = "Current Balance: " + Balance;
    return accinfo;
    }
}
