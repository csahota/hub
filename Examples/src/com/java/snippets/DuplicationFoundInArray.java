package com.java.snippets;

import java.util.HashSet;
import java.util.Set;

/**
 * This class contains code that will find a duplicate value in an array.
 * 
 * Assumption: Array is of data type String.
 * 
 * @author Char Sahota
 * @date Sep. 21, 2019
 *
 */
public class DuplicationFoundInArray {
	
	/**
	 * Private print method returning a String of duplicate values.
	 * 
	 * @param strArry
	 * @return
	 */
	private static String printDuplicates(String[] strArry) {
		
		StringBuffer buff = new StringBuffer();
		
		Set<String> duplicates = new HashSet<String>(); 
		
		for (String str : strArry) { 
			if (duplicates.add(str) == false) { 
				buff.append(str).append(", "); 
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
		
		String[] puppies = new String[] {
				"Goldendoodle",
				"Golden retriever",
				"Husky",
				"Border Collie",
				"Basset Hound",
				"Labrador Retriever",
				"Beagle",
				"Goldendoodle",
				"Beagle",
				"Border Collie"};
		
		System.out.println(printDuplicates(puppies));

	}

}
