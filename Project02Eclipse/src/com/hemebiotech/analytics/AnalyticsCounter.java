package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public static void main(String[] args) {
        // Chemin du fichier symptoms.txt
        String filepath = "symptoms.txt";
        
        // Instance de ReadSymptomDataFromFile pour lire les symptômes
        ISymptomReader reader = new ReadSymptomDataFromFile(filepath);

        // Lire les symptômes depuis le fichier
        List<String> symptoms = reader.GetSymptoms();

        // Utilisation Map pour compter les occurrences de chaque symptôme
        Map<String, Integer> symptomCounts = new TreeMap<>();

        for (String symptom : symptoms) {
            symptomCounts.put(symptom, symptomCounts.getOrDefault(symptom, 0) + 1);
        }

        // Écrire les résultats dans un fichier
        try (FileWriter writer = new FileWriter("result.out")) {
            for (Map.Entry<String, Integer> entry : symptomCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
