package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCounter implements ISymptomCounter {

	@Override
	public Map<String, Integer> GetSymptomsOccurence(List<String> list_symptoms) {
		Map<String, Integer> symptoms_map = new TreeMap<String, Integer>();
		for (int j = 0; j < list_symptoms.size(); j++) {
			// je r�cup�re le symptome
			String symptom = list_symptoms.get(j);
			// je fais une boucle dans la hashmap
			// je v�rifie si le symptome est d�j� pr�sent
			Boolean present = symptoms_map.containsKey(symptom);

			// si pr�sent, j'incr�mente son occurence de +1
			// si pas pr�sent je l'ajoute � la hashmap et j'initialise son occurence � 1
			if (present == false) {
				symptoms_map.put(symptom, 1);
			} else {
				int occurence = symptoms_map.get(symptom);
				occurence++;
				symptoms_map.put(symptom, occurence);
			}

		}

		return symptoms_map;
	}

}
