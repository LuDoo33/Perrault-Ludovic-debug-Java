package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		// first get input
		try {
		// Read from data source
		List <String> listSymptoms = read("C:\\Users\\Mouta\\Desktop\\Projet 4\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		System.out.println(listSymptoms);
		// Count occurrences with stream interface
		Map<String,Long> count = count(listSymptoms);
		System.out.println(count);
		// Create and write on new file
		write(count, "results.out");
		System.out.println("File created");
		} catch (Exception e) {
			System.out.println("Error occured : " + e);
		}

	}
		
	// Return a list with data symptoms
	static List<String> read(String nomFichier){
		ISymptomReader symptoms = new ReadSymptomDataFromFile(nomFichier);
		List<String> listSymptoms = symptoms.getSymptoms();
		Collections.sort(listSymptoms);
		return listSymptoms;
	}
	
	// Return the occurrences of the symptoms in the list
	static Map<String,Long> count(List<String> listSymptoms){
		Map<String,Long> count = listSymptoms
				.stream()
				.collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
		return count;
	}
	
	// Create and write a map with symptoms and number of occurrences on new file
	static void write(Map<String,Long> mapSymptoms, String nomFichier) {
		WriteSymptomDataIntoFile writer = new WriteSymptomDataIntoFile();
		writer.writeSymptom(mapSymptoms, nomFichier);
	}
}

