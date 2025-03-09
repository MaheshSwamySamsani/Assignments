package Assignments4;

import java.util.HashMap;

public class Assignments4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Object> data1 = new HashMap<String, Object>();
		data1.put("EmployeeId", "E001");
		data1.put("Name", "Alice Green");
		data1.put("Age", 30);
		data1.put("Gender", "Female");
		data1.put("Department", "Engineering");
		data1.put("Position", "SoftwareEngineer");
		data1.put("Salery", "75,00");
		data1.put("Email", "alice@example.com");
		data1.put("ContactNumber", 9876543213l);
		//
		HashMap<String, Object> data2 = new HashMap<String, Object>();
		data2.put("EmployeeId", "E002");
		data2.put("Name", "BobJohnson");
		data2.put("Age", 35);
		data2.put("Gender", "male");
		data2.put("Department", "Marketing");
		data2.put("Position", "MarketingManager");
		data2.put("Salery", "85,00");
		data2.put("Email", "bob@example.com");
		data2.put("ContactNumber", 9876543214l);
		//
		HashMap<String, Object> data3 = new HashMap<String, Object>();
		data3.put("EmployeeId", "E003");
		data3.put("Name", "CarolWhite");
		data3.put("Age", 28);
		data3.put("Gender", "FEmale");
		data3.put("Department", "Sales");
		data3.put("Position", "SalesExecutive");
		data3.put("Salery", "65,00");
		data3.put("Email", "carol@example.com");
		data3.put("ContactNumber", 9876543215l);

		System.out.println(data2.get("Email"));

	}

}
