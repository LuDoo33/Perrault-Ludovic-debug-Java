package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomCounter {
	/**
	 * 
	 * @param listNotCounted Sympt�mes lus � partir de Sympt�mes.txt / Symptoms read
	 *                       from symptoms.txt
	 * @return Map avec sympt�me comme cl�, compte comme valeur / Map with symptom
	 *         as key, count as value
	 */
	public Map<String, Integer> processData(List<String> listNotCounted);

}
