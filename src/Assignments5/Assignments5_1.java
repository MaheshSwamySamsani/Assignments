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

		//*********1. Create a list of the top 5 most populated countries in the world and print 2nd Country
		System.out.println("*********************top 5 most populated countries*************************");
		List<String> PopulatedCountries =new ArrayList<String>();
		PopulatedCountries.add("India");
		PopulatedCountries.add("China");
		PopulatedCountries.add("United States");
		PopulatedCountries.add("Indonesia");
		PopulatedCountries.add("Pakistan");
		
		System.out.println(PopulatedCountries.get(1));
	//	2. Create a set of the top 10 most visited tourist attractions in the world and print out its
		System.out.println("*********************top 10 most visited tourist attractions*************************");
		Set<String> Top10 = new HashSet<String>();
		Top10.add("Taj Mahal");
		Top10.add("Eiffel Tower");
		Top10.add("Basilica de la Sagrada Familia");
		Top10.add("Taj MahalGreat Smoky Mountains National Park");
		Top10.add("Empire State Building");
		Top10.add("The Louvre");
		Top10.add("Colosseum");
		Top10.add("Anne Frank House");
		Top10.add("Gardens by the Bay");
		Top10.add("Duomo of Milan");
		
		System.out.println(Top10.size());
		
	//3.Create a map of the 5 largest cities in the United States and their populations.	
		System.out.println("*********************the 5 largest cities in the United States************************");	
		Map<String,String> LargestCities = new HashMap<String,String>();
		LargestCities.put("New York", "8,335,897");
		LargestCities.put("California", "3,822,238");
		LargestCities.put("Chicago", "2,665,039");
		LargestCities.put("Houston", "2,302,878");
		LargestCities.put("Phoenix", " 1,644,409");
		
		System.out.println(LargestCities);
		
		//4.4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
		System.out.println("*********************10 random integers************************");
		
		
		
		
		
		
		
		
		
		//5. Create a list of the top 5 highest-grossing movies of all time and print out the third movieon the list.
		
		System.out.println("*********************the top 5 highest-grossing movies************************");

		List<String> movies= new ArrayList<String>();
		movies.add("Avatar");
		movies.add("Avengers: Endgame");
		movies.add("Avatar: The Way of Water");
		movies.add("Titanic");
		movies.add("Star Wars: The Force Awakens");
		
		System.out.println(movies.get(2));
		
	}

}
