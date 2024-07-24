
// Déclaration du package où se trouve cette interface
package com.hemebiotech.analytics;

import java.util.Map; // Importation de la classe Map de java.util

/**
 * Interface représentant toute entité capable d'écrire des données de symptômes dans une source
 * La partie importante est la valeur de retour de l'opération, qui est une liste de chaînes,
 * pouvant contenir de nombreuses duplications
 * 
 * L'implémentation n'a pas besoin de trier la liste
 */

public interface ISymptomWriter {
	/**
     * Méthode pour écrire les symptômes
     * Si aucune donnée n'est disponible, une liste vide doit être retournée
     * 
	 * @return symptoms une carte brute de tous les symptômes obtenus à partir d'une source de données,
     *        les doublons sont possibles/probables
     */
	public void writeSymptoms (Map<String, Integer> symptoms );
}
