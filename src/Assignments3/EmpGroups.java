package Assignments3;
			

//TODO Auto-generated method stub
		/*
		 * Create an Employees class that stores the following employee names and IDs in
		 * separate variables: • Employee Names: "Bharath", "ABC", "XYZ" • Employee IDs:
		 * 1234, 1235, 1236 Then, create another class called EmpGroups that contains
		 * two arrays to store the employee names and IDs.
		 * 
		 * Retrieve the data from the Employees class, store it in these arrays, and
		 * finally print each employee's name along with their corresponding ID.
		 * Example: • Employee Name: Bharath, Employee ID: 1234
		 */
public class EmpGroups {

	public static void main(String[] args) {
		// Creating an object of Employees class
        Employees obj = new Employees();
        
     // Arrays to store employee names and IDs
        String[] empNames = {obj.empName1, obj.empName2, obj.empName3};
        
     // Store employee IDs in an array
        int[] empIds = {obj.empId1, obj.empId2, obj.empId3};
        
        System.out.println("Employee Names: " + empNames[0] );
        System.out.println("Employee IDs: " + empIds[0]);
        System.out.println("Employee Names: " + empNames[1] );
        System.out.println("Employee IDs: " + empIds[1]);
        System.out.println("Employee Names: " + empNames[2] );
        System.out.println("Employee IDs: " + empIds[2]);
    
    	

	}

	
	
}
