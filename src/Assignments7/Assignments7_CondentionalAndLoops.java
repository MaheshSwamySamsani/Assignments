package Assignments7;

import java.util.ArrayList;
import java.util.List;

public class Assignments7_CondentionalAndLoops {

	public static void main(String[] args) {
		
		/*
		 * Bank Transactions
Positive value refers Credit and Negative refers Debit Transaction
Transactions Amount
1 50000
2 -2000
3 3000
4 -15000
5 -200
6 -300
7 4000
8 -3000
First Store all the transactions in any data structure of Your Choice from collections, and by using
Loops and conditional statements
1. Print total number of credit and debit transactions completed
2. Print the total amount credited and debited in account
3. Print total amount remaining at the end in Bank Account
4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
Transaction with Amount” and also print total number of suspicious transactions
		 */
		
		// Store transactions in an array
				int[] transactions = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };

				// Variables to store totals
				int totalCredits = 0;
				int totalDebits = 0;
				int totalCreditAmount = 0;
				int totalDebitAmount = 0;
				int suspiciousTransactions = 0;

				// Process transactions
				for (int amount : transactions) {
					if (amount > 0) { // Credit
						totalCredits++;
						totalCreditAmount += amount;
						if (amount > 10000) {
							System.out.println("Suspicious credit transaction with Amount: " + amount);
							suspiciousTransactions++;
						}
					} else { // Debit
						totalDebits++;
						totalDebitAmount -= amount;
						if (amount < -10000) {
							System.out.println("Suspicious debit transaction with Amount: " + amount);
							suspiciousTransactions++;
						}
					}
				}

				// Calculate the final remaining amount in the account
				int finalBalance = totalCreditAmount - totalDebitAmount;

				// Output the results
				System.out.println("Total number of credit transactions: " + totalCredits);
				System.out.println("Total number of debit transactions: " + totalDebits);
				System.out.println("Total amount credited: " + totalCreditAmount);
				System.out.println("Total amount debited: " + totalDebitAmount);
				System.out.println("Final remaining amount in the account: " + finalBalance);
				System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
		
		

	}

}
