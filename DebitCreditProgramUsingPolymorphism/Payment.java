package com.DebitCreditProgramUsingPolymorphism;

// payments system working
public class Payment
{
   //making a payment through cash
public void makePayment(double amount)
{
    if(validateAmount(amount))
    {
        System.out.println("Processing payment via Cash...");
        System.out.println("Amount Paid RS :"+amount);
        System.out.println("Payment Successful!");
    }
}

//making a payment through credit card

public void makePayment(String cardHolderName, String creditCardNumber,double amount)
{
    if(validateCardNumber(creditCardNumber) && validateAmount(amount))
    {
        System.out.println("Processing payment via Credit Card...");
        System.out.println("Card Holder :"+cardHolderName);
        System.out.println("Card Number :"+maskCardNumber(creditCardNumber));
        System.out.println("Amount Paid RS :"+amount);
        System.out.println("Payment Successful!");
    }
}

//making a payment through debit card
public void makePayment(String debitCardNumber, double amount)
{
    if(validateCardNumber(debitCardNumber) && validateAmount(amount))
    {
        System.out.println("Processing payment via Debit Card...");
        System.out.println("Card Number :"+maskCardNumber(debitCardNumber));
        System.out.println("Amount Paid RS :"+amount);
        System.out.println("Payment Successful!");
    }
}

//Helper method
private boolean validateAmount(double amount)
{
    if(amount <= 0)
    {
        System.err.println("Error: Amount must be greater than zero.");
        return false;
    }
    return true;
}

private boolean validateCardNumber(String cardNumber)
{
    if(cardNumber.length() !=16)
    {
        System.err.println("Error: Invalid card number. It must be 16 digits.");
        return false;
    }
    return true;
}

private String maskCardNumber(String cardNumber)
{
    return "****_****_****_"+cardNumber.substring(12);
}




}
