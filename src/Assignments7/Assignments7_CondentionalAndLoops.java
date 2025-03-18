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
		
		List<Integer> credit = new ArrayList<Integer>();
		
		credit.add(50000);
		credit.add(3000);
		credit.add(4000);
		
		List<Integer> debit = new ArrayList<Integer>();
		debit.add(-2000);
		debit.add(-15000);
		debit.add(-200);
		debit.add(-3000);
		debit.add(-300);
		
		//total number of credit and debit transactions completed
		System.out.println("Total number of credit transcetions: "+ credit.size());
		System.out.println("Total number of debit transcetions: "+ debit.size());
		Integer Total =  +credit.size() +debit.size();
		System.out.println("Total transactions completed: " + Total);
		
		System.out.println("*******************************************************");
		
		//Print the total amount credited and debited in account
		//Print the total amount credited
		for (int i=0; i<3 ;i++){
		System.out.println("total amount credited: "+credit.get(i));
		}
		Integer credit1= credit.get(0)+credit.get(1)+credit.get(2);
		System.out.println("Total amout credeted:"+ credit1);
		System.out.println("*******************************************************");
		//Print the total amount debited
		for (int j=0; j<=4;j++) {
		System.out.println("total amount debited: "+debit.get(j));
		}
		Integer debit1= debit.get(0)+debit.get(1)+debit.get(2)+debit.get(3)+debit.get(4);
		System.out.println("Total amout debited:"+ debit1);
		System.out.println("*******************************************************");
		
		//3. Print total amount remaining at the end in Bank Account
		
		Integer total1= credit1+debit1;
		System.out.println("total amount remaining: "+ total1);
		System.out.println("*******************************************************");
		
		
		//4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit Transaction with Amount” and also print total number of suspicious transactions
		
		//Credit Amount
		for (int i=0; i<3; i++) {
			if (credit.get(i)>10000) {
				System.out.println("Suspicious credit Transaction: "+credit.get(i));
			}
			
		}
		
		//debit Amount
				for (int j=0; j<4; j++) {
					if (debit.get(j)<-10000) {
						System.out.println("Suspicious debit Transaction: "+debit.get(j));
					}
					
				}
		
		
		

	}

}
