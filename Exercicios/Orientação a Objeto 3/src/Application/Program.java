package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialdeposit = sc.nextDouble();
			account = new Account(number, holder, initialdeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account date");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc .nextDouble();
		account.Deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc .nextDouble();
		account.Withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		sc.close();
	}

}
