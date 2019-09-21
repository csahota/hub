package com.java.snippets;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains code that will find a duplicate value in an dictionary.
 * However the original Dictionary class is now deprecated and instead 
 * all new implementations should implement the Map interface. 
 * 
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class DuplicationFoundInDictionary {

	/**
	 * Private print method returning a String of duplicate values 
	 * in a Map by reversing the map into a second map.
	 * 
	 * @param strArry
	 * @return
	 */
	private static String printDuplicates(Map<String, String> map) {
		
		StringBuffer buff = new StringBuffer();
		HashMap<String, String> duplicates = new HashMap<String, String>();
		
		for (String key : map.keySet()) { 
			
			String value = map.get(key);
			if (duplicates.put(value, key) != null) { 
				buff.append(value).append(", "); 
			} 
		}

		if(buff != null && buff.length()>0) {
			buff.insert(0, "Duplicates string found were: ");
			buff.replace(buff.length()-2, buff.length(), ".");
		} else {
			buff.append("Duplicates were not found.");
		}

		return buff.toString();
	}

	/**
	 * Class main method for application execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<String, String> puppies = new HashMap<String, String>();
		puppies.put("1","Goldendoodle");
		puppies.put("2","Golden retriever");
		puppies.put("3","Husky");
		puppies.put("4","Border Collie");
		puppies.put("5","Basset Hound");
		puppies.put("6","Labrador Retriever");
		puppies.put("7","Beagle");
		puppies.put("8","Goldendoodle");
		puppies.put("9","Beagle");
		puppies.put("10","Border Collie");
		
		System.out.println(printDuplicates(puppies));

	}


}
