package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface ISymptomWriter d�finit un contrat de service pour l'�criture d'une
 * liste de symptomes tri�s avec leurs occurences respectives vers un fichier
 * 
 * @author Fouad
 * @param sortedSymptoms liste de symptomes tri� par odre alphab�tique
 */
public interface ISymptomWriter {
	/**
	 * 
	 * M�thode permettant d'�crire une liste de symptomes � partir dune Map
	 * 
	 * @param sortedSymptoms Liste de type Map de symptomes tri�s avec leurs
	 *                       occurences respectives
	 * 
	 */
	void writeSymptom(Map<String, Integer> sortedSymptoms);

}
