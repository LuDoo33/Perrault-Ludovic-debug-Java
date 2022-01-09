package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * 
 * Classe principale contenant la m�thode main servant � lancer les traitements
 * pour r�cup�rer une iste de symptomes tri�s et comptabilis�s
 * 
 * @author Fouad
 * @param args
 * 
 */

public class Main {

	/**
	 * 
	 * @param args
	 * 
	 * @throws Exception
	 * 
	 * @param reader             Variable de type ISymptomReader utilis� pour la
	 *                           lecture du fichier de symptomes
	 * 
	 * @param counter            Variable de type ISymtomCouner utilis� pour le
	 *                           comptage des symptomes
	 * 
	 * @param writer             Variable de type ISymptomWriter utilis� pour
	 *                           l'�criture de la liste des symptomes tri�s avec
	 *                           leurs occurences respectives
	 * 
	 * @param instance           Variable utilis�e pour cr�ation d'un objet
	 *                           AnalyticsCounter
	 * 
	 * @param symptoms           Variable permettant la r�cup�ration des symtomes
	 *                           dans une liste de type String
	 * 
	 * @param occurencesSymptoms Variable utilis�e pour contenir la liste des
	 *                           symptomes avec leurs occurences respectives
	 * 
	 */

	public static void main(String args[]) throws Exception {
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		ISymptomCounter counter = new SymptomsCounter();
		ISymptomWriter writer = new WriteSymptomDataToFile("result.out");

		AnalyticsCounter instance = new AnalyticsCounter(reader, writer, counter);

		List<String> symptoms = instance.getSymptoms();
		Map<String, Integer> occurenceSymptoms = instance.countSymptoms(symptoms);
		instance.writeSymptoms(occurenceSymptoms);

	}

}
