package com.company;

public class Main {

    public static void main(String[] args) {
        Checking checkingAccount = new Checking("Jan Smith",
                "123456789", 2500);
        Savings savings1 = new Savings("Marek Szczepański",
                "123456789",5000);

        checkingAccount.showInfo();
        System.out.println("------------------------------");
        savings1.showInfo();
    }
}
