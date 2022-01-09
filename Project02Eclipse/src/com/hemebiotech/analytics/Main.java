package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * 
 * Classe principale contenant la m�thode main servant � lancer les traitements
 * pour r�cup�rer une iste de symptomes tri�s et comptabilis�s
 * 
 * @author Fouad
 * 
 */

public class Main {

	/**
	 * 
	 * @param args Contient les arguments de ligne de commande fournis sous la forme
	 *             d'un tableau de String d'objets
	 * 
	 * @throws Exception Utilis� pour lever des exception qui ne peuvent �tre
	 *                   ignor�es
	 * 
	 * @param reader             Variable de type ISymptomReader utilis� pour la
	 *                           lecture du fichier de symptomes et la cr�ation
	 *                           d'une instance AnalyticsCounter
	 * 
	 * @param counter            Variable de type ISymtomCouner utilis� pour le
	 *                           comptage des symptomes et la cr�ation d'une
	 *                           instance AnalyticsCounter
	 * 
	 * @param writer             Variable de type ISymptomWriter utilis� pour
	 *                           l'�criture de la liste des symptomes tri�s avec
	 *                           leurs occurences respectives et la cr�ation d'une
	 *                           instance AnalyticsCounter
	 * 
	 * @param instance           Variable utilis�e pour cr�ation d'un objet
	 *                           AnalyticsCounter
	 * 
	 * @param symptoms           Variable permettant la r�cup�ration des symtomes
	 *                           dans une liste de type String
	 * 
	 * @param occurencesSymptoms Variable utilis�e pour contenir la liste des
	 *                           symptomes avec leurs occurences respectives et leur
	 *                           �criture dansun fichier de sortir
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
