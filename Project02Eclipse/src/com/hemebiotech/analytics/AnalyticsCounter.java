package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {

		TreeMap<String, Integer> sortedListSymptoms = new TreeMap<String, Integer>();
		ArrayList<String> listSymptomsOut = new ArrayList<String>();

		// List of symptoms
		ArrayList<String> listSymptomes = new ArrayList<String>();

		// Get input
		ReadSymptomDataFromFile fichierLu = new ReadSymptomDataFromFile("./Project02Eclipse/symptoms.txt");
		listSymptomes = fichierLu.GetSymptoms();
		
		// Tri et comptage
		sortedListSymptoms = SortAndCompt(listSymptomes);
		listSymptomsOut = ListSymptomsSorted(sortedListSymptoms);

		// Generate output
		WriteSymptomData fichierOut = new WriteSymptomData();
		fichierOut.WriteSymptoms(listSymptomsOut);
	};

	public static TreeMap<String, Integer> SortAndCompt(ArrayList<String> listeSymptoms) {
		TreeMap<String, Integer> result = new TreeMap<String, Integer>();
		int nbOcc = 0;
		for (int i = 0; i < listeSymptoms.size(); i++) {
			nbOcc = result.getOrDefault(listeSymptoms.get(i), 0);
			if (nbOcc == 0) {
				result.put(listeSymptoms.get(i), 1);
			} else {
				result.replace(listeSymptoms.get(i), nbOcc + 1);
			}
		}
		return result;
	}

	public static ArrayList<String> ListSymptomsSorted(TreeMap<String, Integer> listSorted) {
		ArrayList<String> result = new ArrayList<String>();
		String line = "";
		for (Map.Entry<String, Integer> m : listSorted.entrySet()) {
			line = m.getKey() + " : " + m.getValue();
			result.add(line);
		}
		return result;
	}

}