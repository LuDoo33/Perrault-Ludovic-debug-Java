package com.hemebiotech.analytics;

import java.util.List;

/**
 * Interface pour lire les données des symptômes à partir d'une source.

 * La partie importante est la valeur de retour de l'opération, qui est une liste de chaînes
 * pouvant contenir de nombreuses duplications. L'implémentation n'a pas besoin de trier la liste.
 *
 * Les implémentations de cette interface doivent s'assurer que, si aucune donnée n'est disponible,
 * une liste vide est renvoyée.
 */
public interface ISymptomReader {
    /**
     * Lit les données des symptômes à partir d'une source de données.
     * Cette méthode renvoie une liste brute de tous les symptômes obtenus à partir d'une source de données.
     * Des doublons sont possibles/probables. Si aucune donnée n'est disponible, une liste vide est renvoyée.
     * @return une liste de symptômes, pouvant contenir des doublons. Si aucune donnée n'est trouvée, renvoie une liste vide.
     */
    List<String> getSymptoms();
}
