package com.DebitCreditProgramUsingPolymorphism;

import java.util.Scanner;

public class PaymentProcess
{
public static void main(String[] args)
{
System.out.println("Payment Menu");
System.out.println("Please select any one Payment Method from the Menu :");
System.out.println("\t\t 1) Payment by using Cash ");
System.out.println("\t\t 2) Payment by using Credit Card ");
System.out.println("\t\t 3) Payment by using Debit Card ");

Payment payment = new Payment();
Scanner sc = new Scanner(System.in);

System.out.println("Please enter your Payment choice [1/2/3]");
int choice = sc.nextInt();

switch(choice)
{
case 1:
System.out.println("Enter the amount you want to pay through cash :");
double amount = sc.nextDouble();
payment.makePayment(amount);
break;

case 2:
System.out.println("Enter your name :");
String name = sc.nextLine();
name = sc.nextLine();
System.out.println("Enter your 16 digit Credit Card Number :");
String creditCard = sc.nextLine();

System.out.println("Enter your Payment Amount :");
amount = sc.nextDouble();
payment.makePayment(name, creditCard, amount);
break;

case 3 :
System.out.println("Enter your 16 digit Debit Card Number :");
String debitCard = sc.nextLine();
debitCard = sc.nextLine();
System.out.println("Enter your Payment Amount :");
amount = sc.nextDouble();
payment.makePayment(debitCard, amount);
break;
}

sc.close();

}
}