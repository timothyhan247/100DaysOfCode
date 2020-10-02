package Anz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    // set the Customer Number

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    // get the customer number

    public int getCustomerNumber() {
        return customerNumber;
    }

    // set the pin number

    public int setPinNumber(int pinNumber) {
        this.setPinNumber = pinNumber;
        return pinNumber;
    }
    // get checking Account Balance

    public double getCheckingBalance() {
        return savingBalance;
    }

    // get saving balance

    public double getSavingBalance() {
        return savingBalance;
    }
    // calculate checking account withdrawal
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    // calculate saving account withdrawal
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    // calculate Checking account deposit

    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    // calculate Saving Account Deposit

    public double calcSavingDeposit(double amount) {
        double savningBalance;
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
        System.out.println("Amount you want to withdraw from Checking Account:");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance
            ));
        } else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    private int customerNumber;
    private int pinNumber;
    private int setPinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;


    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public DecimalFormat getMoneyFormat() {
        return moneyFormat;
    }

    public void setMoneyFormat(DecimalFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int getSetPinNumber() {
        return setPinNumber;
    }

    public void setSetPinNumber(int setPinNumber) {
        this.setPinNumber = setPinNumber;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }


}
