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
 * @param reader             de type ISymptomReader utilis� pour la lecture du
 *                           fichier de symptomes
 * @param counter            de type ISymtomCouner utilis� pour le comptage des
 *                           symptomes
 * @param writer             de type ISymptomWriter utilis� pour l'�criture de
 *                           la liste des symptomes tri�s avec leurs occurences
 *                           respectives
 * @param instance           variable utilis�e pour cr�ation d'un objet
 *                           AnalyticsCounter
 * @param symptoms           variable permettant la r�cup�ration des symtomes
 *                           dans une liste de type String
 * @param occurencesSymptoms variable utilis�e pour contenir la liste des
 *                           symptomes avec leurs occurences respectives
 */

public class Main {

	/**
	 * 
	 * @param args
	 * @throws Exception
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
