package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface ISymptomReader {
	/**
	 * Anything that will read symptom data from a source
	 * Return value from the operation, which is a list of strings, that may contain many duplications
	 * If no data is available, return an empty List
	 * 
	 * @param filename to find the file symptom.txt from the data source
	 * @return a raw listing of all Symptoms obtained from a data source,
	 *  duplicates are possible/probable
	 * @throws IOException if the file is not created correctly
	 */
	List<String> GetSymptoms (String filename) throws IOException;
	
}
