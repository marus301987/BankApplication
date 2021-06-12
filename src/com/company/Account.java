package com.company;

public abstract class Account implements BaseRate {
    String name;
    String sSN;
    double balance;

static int index = 10000;
String accountNumber;
double rate;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }
    private String setAccountNumber(){
        String lastTwoSSN = sSN.substring(sSN.length()-2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoSSN + uniqueID + randomNumber;
    }
    public abstract void setRate();

    public void showInfo(){
        System.out.println(
                "NAZWA: " + name +
                        "\nNUMER KONTA: " + accountNumber +
                        "\nSTAN KONTA: " + balance + " zł" +
                        "\nOPROCENTOWANIE: " + rate + "%"
        );
    }

}
