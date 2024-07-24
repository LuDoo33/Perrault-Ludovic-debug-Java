// Déclaration du package où se trouve cette classe
package com.hemebiotech.analytics;

import java.io.FileWriter;  // Importation de la classe FileWriter pour écrire dans un fichier
import java.io.IOException;  // Importation de la classe IOException pour gérer les exceptions d'entrée/sortie
import java.util.Map;  // Importation de la classe Map pour utiliser des collections de paires clé/valeur




/**
 * Implémentation simple par force brute de l'interface ISymptomWriter
 * Cette classe écrit les données des symptômes dans un fichier
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	/**
     * Constructeur de la classe
     * 
	 * @param filepath filepath un chemin complet ou partiel vers le fichier contenant les chaînes de caractères des symptômes, une par ligne
     */
	public WriteSymptomDataToFile (String filepath) {
         // Le constructeur est vide dans cette implémentation
	}
	
	@Override
	public void writeSymptoms (Map<String, Integer> symptoms) {
	
        // Écrire les résultats dans un fichier
        try (FileWriter writer = new FileWriter("result.out")) {
             // Parcours de chaque entrée de la carte des symptômes
            for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                // Écriture de chaque symptôme et de son occurrence dans le fichier
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
           // Gestion des exceptions en cas d'erreur d'écriture
            e.printStackTrace();
        }





	}

}
