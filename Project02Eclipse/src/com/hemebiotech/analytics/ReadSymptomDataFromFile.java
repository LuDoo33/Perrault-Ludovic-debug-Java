// Déclaration du package où se trouve cette classe
package com.hemebiotech.analytics;

import java.io.BufferedReader;  // Importation de la classe BufferedReader pour lire des fichiers
import java.io.FileReader;  // Importation de la classe FileReader pour lire des fichiers
import java.io.IOException;  // Importation de la classe IOException pour gérer les exceptions d'entrée/sortie
import java.util.ArrayList;  // Importation de la classe ArrayList pour utiliser une liste dynamique
import java.util.List;  // Importation de l'interface List


/**
 * Implémentation simple par force brute de l'interface ISymptomReader
 * Cette classe lit les données des symptômes à partir d'un fichier
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	 // Chemin du fichier contenant les données des symptômes
	private final String filepath;
	
	/**
     * Constructeur de la classe
     * 
     * @param filepath un chemin complet ou partiel vers le fichier contenant les chaînes de caractères des symptômes, une par ligne
     */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<String>();// Création d'une liste pour stocker les résultats
		
		// Vérification que le chemin du fichier n'est pas nul
		if (filepath != null) {
			try {
				// Création d'un BufferedReader pour lire le fichier
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();// Lecture de la première ligne
				
				 // Boucle de lecture jusqu'à la fin du fichier
				while (line != null) {
					result.add(line);// Ajout de la ligne lue à la liste des résultats
					line = reader.readLine(); // Lecture de la ligne suivante
				}
				reader.close();// Fermeture du BufferedReader
			} catch (IOException e) {
				e.printStackTrace();// Gestion des exceptions en cas d'erreur de lecture
			}
		}
		
		return result;// Retourne la liste des symptômes lus
	}

}
