package com.example.calculator;

public class Deposit {

    private int value;
    private int noOfYears;
    private int  noOfMonths;
    private double interestRate;
    private String capitalisation;
    //private double income;

    //--- methods --------

    public double calculateInterest(int value,int noOfYears,int noOfMonths,double interestRate){
        int totalMonths;
        double interest;
        totalMonths=noOfYears*12+noOfMonths;
        interest=value*interestRate/12*totalMonths;
        return interest;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getCapitalisation() {
        return capitalisation;
    }

    public void setCapitalisation(String capitalisation) {
        this.capitalisation = capitalisation;
    }
}
