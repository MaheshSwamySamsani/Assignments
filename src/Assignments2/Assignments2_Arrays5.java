package Assignments2;

public class Assignments2_Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create a 3D array to represent the following data:
           Semesters as the first dimension.
			 Subjects and Marks as the second dimension.
			 Actual values for Subject Names and Marks as the third dimension.
2. From the array:
 Print Semester 3 - Subject 4 and Subject 5 Names.
 Print Semester 5 - Subject 3 and Subject 6 marks
		 */
		
		
		String [] [] [] Subjects = {{{"Mathematics I","78"},{"Physics","85"},{"Chemistry","91"},{"Computer Programming","74"},{"Engineering Drawing","88"},{"Basic Electrical Eng","79"}},
				{{"Mathematics II","82"},{"Mechanics","77"},{"EnvironmentalSci","93"},{"Basic Electronics","69"},{"Engineering Physics","84"},{"Engineering Graphics","90"}},
				{{"Data Structures","88"},{"DiscreteMathematics","81"},{"DigitalElectronics","76"},{"Operating Systems","92"},{"Signals and Systems","85"},{"Signals and Systems","78"}},
				{{"Algorithms","91"},{"ComputerNetworks","73"},{"DatabaseSystems","89"},{"Microprocessors","80"},{"Communication Eng","76"},{"Software Engineering","87"}},
				{{"Probability & Stats","86"},{"MachineLearning","88"},{"Compiler Design","84"},{"Theory of Computation","95"},{"Embedded Systems","73"},{"Computer Graphics","90"}}
				
				
					
		};
		//Print Semester 3 - Subject 4 and Subject 5 Names.
		System.out.println("Semester 3-Subject 4:"+Subjects[2][3][0]);
		System.out.println("Semester 3-Subject 5:"+Subjects[2][4][0]);
		
		//Print Semester 5 - Subject 3 and Subject 6 marks
		System.out.println("Semester 5-Subject 3:"+Subjects[4][2][1]);
		System.out.println("Semester 5-Subject 6:"+Subjects[4][5][1]);
		
		
		
		

	}

}
