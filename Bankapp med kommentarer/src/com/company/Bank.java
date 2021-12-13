package com.company;

import java.util.ArrayList;
import java.util.List;


//Detta är min State
public class Bank {
    private String BankName;
    private List<Costumer> Customers;


    //Detta är min Constructor
    //Här anger jag BankName och lista på Costumers

    public Bank(String bankName, List<Costumer> customers) {
        BankName = bankName;
        Customers = customers;
    }

    public Bank(String bankName) {
        BankName = bankName;
        Customers = new ArrayList<>();
    }

    //Detta är min Behaviour
    //Den returnerar Bankname
    public String getBankName() {
        return BankName;
    }

    //Den berättar att man vill lägga till accounts med personnummer. Om Costumern finns så så får man costumerindex
    public void AddAccount(long pnr) {
        var customerexists = getCustomerIndex(pnr);
            if (customerexists != -1) {
                var customer = Customers.get(customerexists);
                customer.AddAccount(new Account());
            }
        }
        //Den berättar att vi vill hämta en lista på costumers och om vi hämtar costumers med hjälp av personnummer och den costumern existerar så får vi costumer information. Annars säger den att costumern inte existerar
    public List<String> Getcostumer(long pnr) {
        List<String> temp = new ArrayList<>();
        var customerExists = pnr;
        if (customerExists != -1) {
            var customer = Customers.get((int) customerExists);
            temp.add("Customer info: " + Customers.get((int) customerExists));
        } else {
            temp.add("User not found");
        }
        return temp;
    }

    //Här vill vi få costumerindex och om vi anger rätt personnummer på rätt costumer så returnerar den costumerindex på costumern
    private int getCustomerIndex(long pnr) {
        int custIndex = -1;
        for (var customer : Customers) {
            if (customer.getPersonnummer() == pnr) {
                custIndex = Customers.indexOf(customer);
            }
        }
        return custIndex;
    }

    //Här lägger vi till costumers som vi sedan gör i main metoden
    public void addCustomer(Costumer c) {
        Customers.add(c);
    }
    }
