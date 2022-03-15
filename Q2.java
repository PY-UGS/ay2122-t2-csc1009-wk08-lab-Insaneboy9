package com.daryl;

import java.util.Scanner;

class CheckingAccount{
    private double accountBalance;
    private String accountNumber;
    private double remainingValue;

    CheckingAccount(){
        this.accountBalance=0;
        this.accountNumber="12345";
    }

    public void deposit(double amount){
        this.accountBalance+=amount;
        System.out.println("The balance after deposit is $" + this.accountBalance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount<=this.accountBalance) {
            this.accountBalance -= amount;
            System.out.println("The balance after withdraw is $" + this.accountBalance);
        }

        else{
            remainingValue=amount-this.accountBalance;
            throw new InsufficientFundsException(remainingValue);
        }
    }

    public String getNumber(){
        return this.accountNumber;
    }
}

class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount) {
        this.amount = amount;
        System.out.println("Sorry, but your account is short by: $" + this.getAmount());
    }
    public double getAmount() { return amount; }
}

public class Q2 {
    public static void main(String[] args) throws Exception {
        CheckingAccount bankDemo= new CheckingAccount();
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter the amount you want to deposit");
        float depositAmt= Scan.nextFloat();
        System.out.println("Please enter the amount you want to withdraw");
        float withdrawAmt= Scan.nextFloat();
        bankDemo.deposit(depositAmt);
        bankDemo.withdraw(withdrawAmt);
    }
}
