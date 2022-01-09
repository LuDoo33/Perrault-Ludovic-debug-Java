package com.hemebiotech.analytics;

import java.util.List;

/**
 * Interface ISymptomRear d�finit tout ce qui pourra lire les symptomes � partir
 * d'une source de donn�es. La partie la plus importante est que la valeur
 * retourn�e suite � ce traitement est une liste de chaine de caract�res ouvant
 * contenir des donn�es dupliqu�e.
 *
 * 
 * L'impl�mentation ne n�cessite pas de liste ordonn�es
 * 
 * @author Fouad
 * 
 */
public interface ISymptomReader {
	/**
	 * Si aucune donn�es n'est disponible, la liste retourn�e est vide
	 * 
	 * @return une liste brute de tout les symptomes r�cup�r�s depus la source de
	 *         donn�es, les doublons sont possibles/probables.
	 * 
	 * 
	 */
	List<String> getSymptoms();
}
