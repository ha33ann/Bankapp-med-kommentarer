package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Detta är instans av account listan
        List<Account> customerAccounts = new ArrayList<>();

        //Detta är instans av klassen Bank som ska lägga till costumers med hjälp av personnummer och namn
        Bank b1 = new Bank(" Swedbank");
        b1.addCustomer(new Costumer(1991, "John"));
        b1.addCustomer(new Costumer(1992, "Fredrik"));
        b1.addCustomer(new Costumer(1993, "Simon"));
        b1.addCustomer(new Costumer(1994, "Gustav"));

        //Detta lägger till accounts baserat på personnummer
        b1.AddAccount(1991);
        b1.AddAccount(1991);
        b1.AddAccount(1992);
        b1.AddAccount(1992);
        b1.AddAccount(1992);
        b1.AddAccount(1993);
        b1.AddAccount(1994);
        b1.AddAccount(1994);
        b1.AddAccount(1995);

        //Detta printar ut bankens namn (Swedbank)
        System.out.println("BANK:" + b1.getBankName());

        //Detta är en instans av klassen account som ska lägga till nya accounts
        Account a1 = new Account();

        //Detta printar ut den första costumers information, before deposit och after deposit)
        System.out.println(b1.Getcostumer(0));
        System.out.println("BEFORE DEPOSIT: " + a1.getBalance());
        a1.Deposit(100);
        System.out.println("DEPOSIT 100");
        System.out.println(a1.Accountinfo() + " (AFTER DEPOSIT)");
        a1.Withdraw(100);
        System.out.println("************************************");
        System.out.println();

        //Detta printar ut den andra costumers information, before depoist, after deposit och after withdraw
        System.out.println(b1.Getcostumer(1));
        System.out.println("BEFORE DEPOSIT: " + a1.getBalance());
        a1.Deposit(1000);
        System.out.println("DEPOSIT 1000");
        System.out.println("AFTER DEPOSIT: " + a1.getBalance());
        a1.Withdraw(500);
        System.out.println("Withdraw 500");
        System.out.println(a1.Accountinfo() + " (AFTER DEPOSIT + WITHDRAW)");
        a1.Withdraw(500);
        System.out.println("************************************");
        System.out.println();

        //Detta printar ut information om den tredje costumers information, before withdraw och after withdraw
        System.out.println(b1.Getcostumer(2));
        a1.Deposit(350);
        System.out.println("BEFORE WITHDRAW: " + a1.getBalance());
        a1.Withdraw(100);
        System.out.println("WITHDRAW 100");
        System.out.println(a1.Accountinfo() + " (AFTER WITHDRAW)");
        a1.Withdraw(250);
        System.out.println("************************************");
        System.out.println();

        //Detta printar ut den fjärde costumers information, before deposit och after deposit
        System.out.println(b1.Getcostumer(3));
        System.out.println("BEFORE DEPOSIT: " + a1.getBalance());
        a1.Deposit(650);
        System.out.println("DEPOSIT 650");
        System.out.println(a1.Accountinfo() + " (AFTER DEPOSIT)");
        a1.Withdraw(650);
        System.out.println("************************************");
        System.out.println();

    }
}
