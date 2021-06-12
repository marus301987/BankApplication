package com.company;

public class Checking extends Account{
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
                "TYP KONTA: Użytkowe" +
                "\nNUMER KARTY: " + debitCardNumber +
                "\nPIN DO KARTY: " + debitCardPin
        );
    }
}