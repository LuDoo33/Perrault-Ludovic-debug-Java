package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Dans cette classe SymptomCalcul nous allons une utiliser une m�thode qui
 * deternminera le nombre de chaque �l�ments contenu dans une liste, c'est �
 * dire le nombre de redondance existant.
 * 
 * @author El Ouaryaghli
 * @version 1.0
 * 
 */

public class SymptomCalcul {

	// METHODE QUI VIENDRA PRODUIRA UN DICTIONNAIRE DE SYMTOMES DANS LEQUEL CHAQUE
	// SYMTOMES Y SERA ASSOCIE SON NOMBRE
	/**
	 * Le but de cette m�thode est de produire un dictionnaire dont les cl� sont les
	 * chaines de caract�res de l'ensemble instanci� et les valeurs seront pour
	 * chaque caract�re de la liste associ�e au nombre de r�p�tition correspondant.
	 * 
	 * @param symptomesLst Il s'agit d'une liste de chaines caract�res
	 * @param symptomes    Il s'agit d'un ensemble de chaines de caract�res
	 *                     diff�rents
	 * @return symptomeNbre Il s'agit du dictionnaire : (chaine de caract�re par
	 *         indice ; nombre de redondance de la chaine de caract�re)
	 */

	public static Map<String, Integer> Calcul(List<String> symptomesLst, Set<String> symptomes) {

		int cnt = 0; // compteur du nombre de symptomes
		Map<String, Integer> symptomeNbre = new HashMap<String, Integer>();

		for (String k : symptomes) { // on lit chaque symptome de l'ensemble symptomes
			for (int i = 0; i < symptomesLst.size(); i++) { // on compare chaque symptome de cet ensemble
															// chaque symptome de la liste symptomesLst
				if (k.contains(symptomesLst.get(i))) { // et d�s lors qu'il y a une �galit�
					cnt++; // cela signifie que l'on retrouve une nouvelle fois ce symptomes
					symptomeNbre.put(symptomesLst.get(i), cnt); // on renseigne donc ce point � la HashMap
				}
			}
			cnt = 0;
		}

		return symptomeNbre;

	}

}
