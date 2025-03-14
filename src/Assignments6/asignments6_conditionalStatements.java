package Assignments6;

public class asignments6_conditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A bank evaluates loan applicants based on the following criteria: 1.
		 * CreditScore: o If the credit score is above 750, the loan is automatically
		 * approved. 
		 * 2. If the credit score is between 650 and 750, additional checks are performed.
		 *  3 If the credit score is below 650, the loan is denied.
		 * 
		 * 2. Income: o For credit scores between 650 and 750, the customer’s income
		 * must be at least $50,000 for the loan to be considered.
		 * 
		 * 3. Employment Status: o If the customer’s income is at least 50,000, the
		 * system checks whether the customer is employed. o If the customer is
		 * unemployed, the loan is denied.
		 * 
		 * 4. Debt-to-Income Ratio: If the customer is employed, the system checks the
		 * debt-to-income (DTI) ratio. If the DTI ratio is less than 40%, the loan is
		 * approved. If the DTI ratio is 40% or greater, the loan is denied.
		 * 
		 * 
		 * Now based on below details, print whether user is eligible to get the loan or
		 * not customerName = "John Doe"; creditScore = 720; income = 55000.0;
		 * isEmployed = true; debtToIncomeRatio = 35.0;
		 */
		
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		
		if (creditScore  > 750) {
			System.out.println("Loan is Approved");
		}
		else if (creditScore  < 650) {
				System.out.println("Loan is denied");	
			}
			else if (creditScore>650  && creditScore<750) {
					System.out.println("CreditScore"+creditScore);
					
					if (income >= 50000) {
						System.out.println("Custemer is employeed  "+ isEmployed);
						System.out.println("Custemer Income  "+ income);
						
									if (debtToIncomeRatio < 40.0) {
									System.out.println("thecustomer  loan is approved  and the DTI ratio is  " + debtToIncomeRatio);
									}
									else if (debtToIncomeRatio > 40.0){
									System.out.println("thecustomer  loan is Denied");
									}
						
						
					}
					else if (income <= 50000){
						System.out.println("customer is unemployed denied");
					}
					
					
					
					
					
					
			}
			
			
			
		}

	}

	
