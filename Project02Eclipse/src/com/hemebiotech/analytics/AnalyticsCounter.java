package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Classe principale pour l'analyse des symptômes
 * Elle utilise un ISymptomReader pour lire les données et un ISymptomWriter pour écrire les résultats
 */
public class AnalyticsCounter {

    // Attribut pour lire les symptômes
    private final ISymptomReader reader;
    
    // Attribut pour écrire les résultats des symptômes
    private final ISymptomWriter writer;

    /**
     * Constructeur de la classe AnalyticsCounter
     * Initialise les attributs reader et writer avec les objets fournis
     *
     * @param reader un objet de type ISymptomReader pour lire les données des symptômes
     * @param writer un objet de type ISymptomWriter pour écrire les résultats des symptômes
     */
    public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    /**
     * Méthode pour récupérer la liste des symptômes à partir du fichier
     *
     * @return une liste de chaînes de caractères représentant les symptômes
     */
    public List<String> getSymptoms() {
        return reader.getSymptoms();
    }

    /**
     * Méthode pour compter les occurrences de chaque symptôme
     *
     * @param symptoms une liste de chaînes de caractères représentant les symptômes
     * @return une carte (Map) où les clés sont les symptômes et les valeurs sont leurs occurrences
     */
    public Map<String, Integer> countSymptoms(List<String> symptoms) {
        // Utilisation d'une HashMap pour stocker les occurrences des symptômes
        Map<String, Integer> symptomCounts = new HashMap<>();
        for (String symptom : symptoms) {
            // Si le symptôme est déjà présent dans la carte, incrémentez son occurrence
            // Sinon, ajoutez le symptôme à la carte avec une occurrence initiale de 1
            symptomCounts.put(symptom, symptomCounts.getOrDefault(symptom, 0) + 1);
        }
        return symptomCounts;
    }

    /**
     * Méthode pour trier les symptômes par ordre alphabétique
     *
     * @param symptoms une carte (Map) des symptômes avec leurs occurrences
     * @return une carte triée (TreeMap) des symptômes par ordre alphabétique
     */
    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
        // Utilisation de TreeMap pour trier les symptômes par ordre alphabétique
        return new TreeMap<>(symptoms);
    }

    /**
     * Méthode pour écrire les résultats des symptômes dans un fichier
     *
     * @param symptoms une carte (Map) des symptômes avec leurs occurrences triées
     */
    public void writeSymptoms(Map<String, Integer> symptoms) {
        // Utilisation de l'objet writer pour écrire les symptômes dans un fichier
        writer.writeSymptoms(symptoms);
    }

  
}
