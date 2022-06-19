package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Dans cette classe principale on r�pond aux cahiers des charges en instanciant
 * les methodes :
 * 
 * SymptomReader.ReadFiles("datas/symptoms.txt")
 * SymptomReader.symptomes(symptomesLst) SymptomCalcul.Calcul(symptomesLst,
 * symptomes) SymptomWriter.CreatFiles("datas/result.out", symptomeNbre)
 * 
 * Apr�s avoir extrait une lite de symptomes � partir du fichier source et gr�ce
 * � la methode SymptomReader.ReadFiles("datas/symptoms.txt") , on produira un
 * ensemble de symptomes. Nous connaitrons ainsi le nombre de personnes
 * affect�es ainsi que le nombre de symptomes existant
 * 
 * A l'aide de la methode SymptomCalcul.Calcul(symptomesLst, symptomes) nous
 * pourrons determiner toutes les occurrences de tout sympt�me.
 * 
 * 
 * @see SymptomWriter
 * @see SymptomCalcul
 * @see SymptomReader
 * 
 * @author El Ouaryaghli
 * 
 * @version 1.0
 */

public class AnalyticsCounter {

	public static void main(String[] args) throws IOException {

		// =================================================== DEFINTION DES ATTRIBUTS
		// == DEBUT

		Set<String> symptomes = new HashSet<String>(); // cr�ation d'un ensemble o�
		// sera repertorier tous les symboles

		List<String> symptomesLst = new ArrayList<String>(); // cr�etion d'une liste

		Map<String, Integer> symptomeNbre = new HashMap<String, Integer>();

		String pathRead = "Project02Eclipse/symptoms.txt"; // chemin d'acc�s au fichier symptoms.txt pour lecture
		String pathWrite = "Project02Eclipse/result.out"; // chemin o� sera gen�rer le fichier result.out

		// =================================================== DEFINTION DES ATTRIBUTS
		// == FIN

		symptomesLst = SymptomReader.ReadFiles(pathRead);
		symptomes = SymptomReader.symptomes(symptomesLst);

		// System.out.println(symptomes);
		// System.out.println(symptomes.size());

		symptomeNbre = SymptomCalcul.Calcul(symptomesLst, symptomes);

		SymptomWriter.CreatFiles(pathWrite, symptomeNbre);

		System.out.println("Le fichier est disponible sous: " + pathWrite);

	}
}
