package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Classe permettant de compter le nombre de symptomes dans un fichier texte,
 * trier et compter les symptomes pour les �crire dans un fichier de sortie
 * 
 * @author Fouad
 * 
 * @param reader  Attribut de la classe AnalyticsCounter de type ISymptomReader
 * @param writer  Attribut de la classe AnalyticsCounter de type ISymptomWriter
 * @param counter Attribut de la classe AnalyticsCounter de type ISymptomCounter
 * 
 * 
 */
public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;
	private ISymptomCounter counter;

	/**
	 * 
	 * @param providedReader  param�tre du constructeur de la Classe pour l'attribut
	 *                        reader
	 * @param providedWriter  param�tre du constructeur de la Classe pour l'attribut
	 *                        writer
	 * @param providedCounter param�tre du constructeur de la Classe pour l'attribut
	 *                        counter
	 * 
	 * 
	 */
	public AnalyticsCounter(ISymptomReader providedReader, ISymptomWriter providedWriter,
			ISymptomCounter providedCounter) {
		this.reader = providedReader;
		this.writer = providedWriter;
		this.counter = providedCounter;
	}

	/**
	 * 
	 * @param listSymptoms Liste utilis� pour stocker les symptomes r�cup�r�s par la
	 *                     m�thode getSymtoms
	 * 
	 * @return listSymptoms Retourne une liste de symptomes brutes
	 */
	public List<String> getSymptoms() {
		System.out.println("Lecture du fichier en cours...");

		List<String> listSymptoms = this.reader.getSymptoms();
		System.out.println("Lecture du fichier OK");
		return listSymptoms;
	}

	/**
	 * 
	 * @param symptoms Liste de symptomes brutes
	 * 
	 * @return occurenceSymptoms Liste de symptomes tri�es avec leurs occurences
	 *         respectives
	 * 
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms) {

		System.out.println("Comptage des symptomes en cours...");

		Map<String, Integer> occurenceSymptoms = this.counter.getSymptomsOccurence(symptoms);
		System.out.println("Comptage des symptomes OK");

		return occurenceSymptoms;

	}

	/**
	 * 
	 * @param occurenceSymptoms Map utilis� pour l'�criture des symptomes avec leurs
	 *                          occurences respectives
	 */
	public void writeSymptoms(Map<String, Integer> occurenceSymptoms) {

		System.out.println("Ecriture des r�sultats dans le fichier de sortie en cours...");

		this.writer.writeSymptom(occurenceSymptoms);
		System.out.println("Ecriture des r�sultats dans le fichier de sortie en cours OK");

	}

}
