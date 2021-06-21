package com.hemebiotech.analytics;

import java.util.List;
import java.util.Set;

/**
 * Anything that will write symptom in a text file
 * The important part is, the return value from the operation, which is a list of strings,
 * that contains the symptoms and their occurrence numbers.
 * 
 */
public interface ISymptomWriter {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return UnOrdered List of Symptoms imported from file symptoms.txt
	 */
	Set<String> SetSymptoms(List<String> symptomsList);

}
