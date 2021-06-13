package com.company;

import utilities.CSV;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();


        String file = "C:\\Users\\Marek\\Desktop\\NewBankAccounts.csv";

        List<String[]> newAccountHolder = CSV.read( file );
        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble( accountHolder[3] );

            if (accountType.equals( "Oszczędnościowe" )) {
                accounts.add( new Savings( name, sSN, initDeposit ) );
            } else if (accountType.equals( "Użytkowe" )) {
                accounts.add( new Checking( name, sSN, initDeposit ) );
            } else {
                System.out.println( "BŁĄD WCZYTYWANIA TYPU KONTA" );
            }
        }
        for (Account acc : accounts) {
            System.out.println();
            System.out.println( "*********** NOWE KONTO ***********" );
            acc.showInfo();
            System.out.println( "----------------------------------" );
        }
    }
}