package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	/**
	 * Lire un fichier � partir d'une source/Read a file from a source.
	 */
	static final String inPutFile = "Project02Eclipse/symptoms.txt";
	/**
	 * �crire le r�sultat dans un fichier assign�/Write result to an assigned file
	 */
	static final String outPutFile = "Project02Eclipse/result.out";

	public static void main(String args[]) {

		/**
		 * 
		 * @analyse Creation d'une instance de classe qui impl�mente les interfaces
		 */
		Analyse analyse = new Analyse(new ReadSymptomDataFromFile(inPutFile), new CountAndOrderSymptoms(),
				new GenerateOutput(outPutFile));
		/**
		 * lecture � partir de inPutFile 
		 */
		List<String> listNotCounted = analyse.getSymptom();
		/**
		 * compter le nombre d'occurrences et trier les sympt�mes par ordre alphab�tique
		 */
		Map<String, Integer> mapSortedAndCounted = analyse.symtomsCounter(listNotCounted);
		/**
		 * �crire dans outPutFile
		 */
		analyse.writeDataSymptoms(mapSortedAndCounted);

	}
}
