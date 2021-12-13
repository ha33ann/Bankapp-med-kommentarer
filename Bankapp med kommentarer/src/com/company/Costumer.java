package com.company;

import java.util.ArrayList;
import java.util.List;

public class Costumer {
    //Detta är min State
    private int Personnummer;
    private String Name;
    private List<Account> Accounts;

    //Detta är min Constructor
    //Här skapar jag objekt från costumer klassen som innehåller personnummer, namn och lista på accounts
    public Costumer(int Personnummer, String Name, List<Account> Accounts){
        Personnummer = Personnummer;
        Name = Name;
        Accounts = Accounts;

    }


    public Costumer(int personnummer, String name) {
        Personnummer = personnummer;
        Name = name;
        Accounts = new ArrayList<>();
    }

    //Detta är min Behaviour
    //Här anger jag jag vill lägga till accounts. Här anger jag även att jag vill returnera personnummer, namn, och antal accounts
    public void AddAccount(Account acc){
        Accounts.add(acc);
    }
    public int getPersonnummer(){
        return Personnummer;
    }
    public String getName(){
        return Name;
    }
    public List<Account> getAccounts(){
        return Accounts;
    }

    @Override
    //Här returnerar den informationen som en användare har hos banken såsom personnummer, namn, antal konton och vilken typ av bank de har
    public String toString() {
        return "Personnummer: " + Personnummer +
                ", Namn: " + Name + "" +
                ", Accounts: " + Accounts.size() + ", " +
                "Banktype: Debit";

    }
    }
