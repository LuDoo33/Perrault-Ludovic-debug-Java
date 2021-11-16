package com.hemebiotech.analytics;

import java.util.List;

/**
 * Tout ce qui lira les donn�es de sympt�mes � partir d'une source La partie
 * importante est, le valeur de retour de l'op�ration, qui est une liste de
 * cha�nes, pouvant contenir de nombreux doublons.
 * L'impl�mentation n'a pas besoin de trier la liste / The implementation does
 * not need to order the list
 * 
 */
public interface ISymptomReader {

	/**
	 * If no data is available, return an empty List
	 * 
	 * @return une liste de tous les sympt�mes obtenus � partir d'une source de donn�e /
	 * raw listing of all Symptoms obtained from a data source
	 */
	List<String> getSymptoms();

}
