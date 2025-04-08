package assignments8;
import java.util.*;

class Employee {
	/*
	 * Employees with Experience >= 5 Years get extra Reward of 5000;
	 * 
	 * There are 5 Employee records. Now Calculate the Hike percentage of each
	 * Employee and store the Values in Map with EmployeeName and
	 * HikePercentagevalue and Print them.
	 * 
	 * Hike = ( Base Salary * variable pay % ) + Bonus+Reward ; Hike % = Hike / Base
	 * Salary .
	 */
	
	
	
    String name;
    double baseSalary;
    int experience;
    double rating;

    Employee(String name, double baseSalary, int experience, double rating) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.experience = experience;
        this.rating = rating;
    }
}

public class EmployeeHikeCalculator {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice Johnson", 75000, 5, 4.2),
            new Employee("Bob Smith", 68000, 3, 3.8),
            new Employee("Carol Davis", 82000, 7, 4.5),
            new Employee("David Brown", 90000, 10, 2.0),
            new Employee("Eva Green", 60000, 2, 3.5)
        );

        Map<String, Double> employeeHikePercentage = new HashMap<>();

        for (Employee emp : employees) {
            double variablePercent = 0;
            double bonus = 0;
            double reward = (emp.experience >= 5) ? 5000 : 0;

            if (emp.rating >= 4) {
                variablePercent = 15;
                bonus = 1500;
            } else if (emp.rating >= 3 && emp.rating < 4) {
                variablePercent = 10;
                bonus = 1200;
            } else {
                variablePercent = 3;
                bonus = 300;
            }

            double hike = (emp.baseSalary * variablePercent / 100) + bonus + reward;
            double hikePercentage = (hike / emp.baseSalary) * 100;

            employeeHikePercentage.put(emp.name, hikePercentage);
        }

        // Print the hike percentages
        for (Map.Entry<String, Double> entry : employeeHikePercentage.entrySet()) {
            System.out.printf("%s => Hike Percentage: %.2f%%\n", entry.getKey(), entry.getValue());
        }
    }
}
