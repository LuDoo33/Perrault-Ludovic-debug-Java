package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author massine
 * 
 *         cette class compte toutes les occurrences de tout symptôme liste dans
 *         le fichier
 */
public class CalculOccuranceSymptomes implements ISymptomCalcul {

	public List<String> listeSymptomes;

	/**
	 * 
	 * @param listeSymptoms une liste de sympomes
	 */
	public CalculOccuranceSymptomes(List<String> varListeSymptomes) {
		this.listeSymptomes = varListeSymptomes;
	}

	@Override
	public Map<String, Integer> getMapSymptomes() {
		int nombreOccurance = 0;
		Map<String, Integer> mapSymptomes = new HashMap<>();

		for (String element : this.listeSymptomes) {
			if (mapSymptomes.containsKey(element)) {
				nombreOccurance = mapSymptomes.get(element);
				mapSymptomes.put(element, nombreOccurance + 1);
			} else {
				mapSymptomes.put(element, 1);
			}
		}

		return mapSymptomes;
	}
}
