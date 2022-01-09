package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface ISymptomWriter d�finit un contrat de service pour l'�criture d'une
 * liste de symptomes tri�s dans un fichier de sortie
 * 
 * @author Fouad
 * 
 */
public interface ISymptomWriter {
	/**
	 * 
	 * @param sortedSymptoms liste de symptomes tri� par odre alphab�tique avec
	 *                       leurs occurences respectives
	 */
	void writeSymptom(Map<String, Integer> sortedSymptoms);

}
