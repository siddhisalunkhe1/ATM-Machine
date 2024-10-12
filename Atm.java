package com.ATMmachin;

import java.util.Scanner;

public class Atm
{
	float balance;
	int pin = 7070;
	
	public void checkPin()
	{
		System.out.println("-=-=- ATM MAchine-=-=-");
		System.out.println("Enter your pin : ");
		Scanner in = new Scanner(System.in);
		int enteredPin = in.nextInt();
		if(enteredPin == pin)
		{
			menu();
		}
		else
		{
			System.out.println("You have entered wrong pin.");
		}
	}
	
	public void menu()
	{
		System.out.println("Enter Your Choice : ");
		System.out.println("1. Chech A/C Balance ");
		System.out.println("2 .Withdraw Money ");
		System.out.println("3. Deposite Money ");
		System.out.println("4 . Exit");
		
		Scanner in = new Scanner(System.in);
		int option = in.nextInt();
		
		if(option == 1)
		{
			checkBalance(9000);
		}
		else if(option == 2)
		{
			withdrawMoney();
		}
		else if(option == 3)
		{
			depositeMoney();
		}
		else if(option == 4)
		{
			return;
		}
		else
		{
			System.out.println("Enter valid choice(1/2/3/4");
		}	
	}
	
	public void checkBalance(float balance)
	{
		this.balance=balance;
		System.out.println("Balance : "+balance);
		menu();
	}
	
	public void withdrawMoney()
	{
		System.out.println("Enter amount to withdraw : ");
		Scanner in = new Scanner(System.in);
		float amount = in.nextFloat();
		if(amount>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance = balance - amount;
			System.out.println("Money Withdrawl successfully.");
		}
		menu();
	}
	
	public void depositeMoney()
	{
		System.out.println("Enter the amount : ");
		Scanner in = new Scanner(System.in);
		float amount = in.nextFloat();
		balance = balance + amount;
		System.out.println("Money deposited successfully ");
		menu();
	}
}
