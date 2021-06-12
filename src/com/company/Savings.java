package com.company;

public class Savings extends Account {
    int safetyDepositBoxID;
    int safetyDepoditBoxPin;

    public Savings(String name, String sSN, double initDeposit) {
        super( name, sSN, initDeposit );
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepoditBoxPin = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "TYP KONTA: Oszczędnościowe" +
                "\nNUMER SKRYTKI DEPOZYTOWEJ: " + safetyDepositBoxID +
                "\nPIN DO SKRYTKI: " + safetyDepoditBoxPin
        );
    }
}
