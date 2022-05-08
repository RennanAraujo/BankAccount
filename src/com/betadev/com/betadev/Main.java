package com.betadev;

public class Main {

    public static void main(String[] args) {
        System.out.println("App is running");
        BankAccount BA1 = new BankAccount();
        BA1.setAccountNumber(1111);
        BA1.setAccountOwner("Cassius Clay");
        BA1.openAccount("CC");
        BA1.deposit(1000);
        BA1.withdraw(950);
        BA1.payMonthlyFee(9.90f);
        BA1.summaryAccount();
    }
}
