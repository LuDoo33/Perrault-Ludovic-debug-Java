package com.hemebiotech.analytics;

import java.util.List;

/**
 * Tout ce qui pourra lire les symptomes � partir d'une source de donn�es. La
 * partie la plus importante est que la valeur retourn�e suite � ce traitement
 * est une liste de chaine de caract�res pouvant contenir des donn�es
 * dupliqu�es.
 *
 * 
 * L'impl�mentation ne n�cessite pas de liste ordonn�es
 * 
 */
public interface ISymptomReader {
	/**
	 * 
	 * M�thode permettant de r�cup�rer une liste de symptomes � partir d'un fichier
	 * 
	 * Si aucune donn�es n'est disponible, la liste retourn�e est vide
	 * 
	 * @return une liste brute de tout les symptomes r�cup�r�s depus la source de
	 *         donn�es, les doublons sont possibles/probables.
	 * 
	 * 
	 */
	List<String> getSymptoms();
}
