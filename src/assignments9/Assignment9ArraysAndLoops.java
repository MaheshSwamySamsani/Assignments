package assignments9;
/*Given values are 12 ,34,11,36,87,98,93.
Store the values in Array and Print second and third largest number from the above values without
using collections and default sort methods*/

	public class Assignment9ArraysAndLoops {

	    public static void main(String[] args) {
	        int[] numbers = {12, 34, 11, 36, 87, 98, 93};

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;
	        int third = Integer.MIN_VALUE;

	        for (int num : numbers) {
	            if (num > first) {
	                third = second;
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                third = second;
	                second = num;
	            } else if (num > third && num != second && num != first) {
	                third = num;
	            }
	        }

	        System.out.println("Second Largest Number: " + second);
	        System.out.println("Third Largest Number: " + third);
	    }
	}

