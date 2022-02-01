package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/** @return compteurs = retourne le nombre d'occurences contenues dans la map compteurs.
* @param compte l'ensemble des �l�ments pr�sents dans la map */ 

public class CountSymptoms {
	
	public Map<String, Integer> nbOccurrence(List<String> symptomsList) {

		Map<String, Integer> compteurs = new HashMap<String, Integer>();

		for(String symptom : symptomsList) {	/** Boucle sur chaque �l�ment "symptom" contenu dans ma liste de symptomes */
			if (compteurs.containsKey(symptom)) {	/** on analyse si le symptome existant dans la Map*/
																  
				compteurs.put(symptom, compteurs.get(symptom)+1); /** Si symptome existant, alors on va l'incr�menter de 1 */
				
			} else {
				compteurs.put(symptom, 1); /** Si le symptome n'existe pas, on va lui mettre 1 en valeur */
			}
		}
		return compteurs; /** retourne le r�sultat de la map compteurs */ 
	
	}
}


