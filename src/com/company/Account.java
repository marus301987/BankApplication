package com.company;

public abstract class Account implements BaseRate {
    private String name;
    private String sSN;
    private double balance;

private static int index = 10000;
protected String accountNumber;
protected double rate;

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

    public void compound(){
        double accuredInterest = balance * (rate/100);
        balance = balance + accuredInterest;
        System.out.println("Odsetki wynoszą: " + accuredInterest + " zł");
        printBalance();
    }

    public void deposit(double amount){
        balance = balance + amount;
        printBalance();
    }
    public void withdraw(double amount) {
        balance = balance - amount;
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Przesłano " + amount + " zł" + " do: " + toWhere);
        printBalance();
    }
    public void printBalance() {
        System.out.println("Stan konta wynosi: " + balance + " zł");
    }

    public void showInfo(){
        System.out.println(
                "DANE POSIADACZA: " + name +
                        "\nNUMER KONTA: " + accountNumber +
                        "\nSTAN KONTA: " + balance + " zł" +
                        "\nOPROCENTOWANIE: " + rate + "%"
        );
    }

}
