package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;


/**
 * Classe Main qui sert de point d'entrée à l'application
 */


public class Main {
    /**
     * Méthode main qui orchestre les différentes étapes de l'application
     *
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // Création d'une instance de ReadSymptomDataFromFile pour lire les symptômes à partir d'un fichier
        ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
        
        // Création d'une instance de WriteSymptomDataToFile pour écrire les résultats dans un fichier
        ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
        
        // Création d'une instance d'AnalyticsCounter avec les objets reader et writer
        AnalyticsCounter analytics = new AnalyticsCounter(reader, writer);
        
        // Récupération de la liste des symptômes
        List<String> symptoms = analytics.getSymptoms();
        
        // Comptage des occurrences des symptômes
        Map<String, Integer> symptomCounts = analytics.countSymptoms(symptoms);
        
        // Tri des symptômes par ordre alphabétique
        Map<String, Integer> sortedSymptoms = analytics.sortSymptoms(symptomCounts);
        
        // Écriture des résultats dans un fichier
        analytics.writeSymptoms(sortedSymptoms);
    }
}
