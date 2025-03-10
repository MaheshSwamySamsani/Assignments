package Assignments5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignments5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *********1. Create a list of the top 5 most populated countries in the world
		// and print 2nd Country
		System.out.println("*********************top 5 most populated countries*************************");
		List<String> populatedCountries = new ArrayList<String>();
		populatedCountries.add("India");
		populatedCountries.add("China");
		populatedCountries.add("United States");
		populatedCountries.add("Indonesia");
		populatedCountries.add("Pakistan");

		System.out.println(populatedCountries.get(1));
		// 2. Create a set of the top 10 most visited tourist attractions in the world
		// and print out its
		System.out.println("*********************top 10 most visited tourist attractions*************************");
		Set<String> top10 = new HashSet<String>();
		top10.add("Taj Mahal");
		top10.add("Eiffel Tower");
		top10.add("Basilica de la Sagrada Familia");
		top10.add("Taj MahalGreat Smoky Mountains National Park");
		top10.add("Empire State Building");
		top10.add("The Louvre");
		top10.add("Colosseum");
		top10.add("Anne Frank House");
		top10.add("Gardens by the Bay");
		top10.add("Duomo of Milan");

		System.out.println(top10.size());

		// 3.Create a map of the 5 largest cities in the United States and their
		// populations.
		System.out.println("*********************the 5 largest cities in the United States************************");
		Map<String, String> largestCities = new HashMap<String, String>();
		largestCities.put("New York", "8,335,897");
		largestCities.put("California", "3,822,238");
		largestCities.put("Chicago", "2,665,039");
		largestCities.put("Houston", "2,302,878");
		largestCities.put("Phoenix", " 1,644,409");

		System.out.println(largestCities);

		// 4.4. Create an array of 10 random integers and print out the sum of 3rd and
		// 5th Value.
		System.out.println("*********************10 random integers************************");

		int integers[] = new int[10];
		integers[0] = 1;
		integers[1] = 2;
		integers[2] = 3;
		integers[3] = 4;
		integers[4] = 5;
		integers[5] = 6;
		integers[6] = 7;
		integers[7] = 8;
		integers[8] = 9;
		integers[9] = 10;

		int sum;
		sum = integers[2] + integers[4];
		System.out.println("sum of 3rd and 5th Value:" + sum);

		// 5. Create a list of the top 5 highest-grossing movies of all time and print
		// out the third movieon the list.

		System.out.println("*********************the top 5 highest-grossing movies************************");

		List<String> movies = new ArrayList<String>();
		movies.add("Avatar");
		movies.add("Avengers: Endgame");
		movies.add("Avatar: The Way of Water");
		movies.add("Titanic");
		movies.add("Star Wars: The Force Awakens");

		System.out.println(movies.get(2));

	}

}
