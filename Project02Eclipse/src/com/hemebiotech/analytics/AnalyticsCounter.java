package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	
	
	
	
	// TODO Enlever ces proprietes 
	private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
	
	public static void main(String args[]) throws Exception {
		
		
		// TODO recevoir en arguments le nom de fichier d'entree et le nom de fichier de sortie
		String fileIn = args.length > 0 ? args[0] : SymptomFileReader.DEFAULT_FILENAME_IN;
		String fileOut = args.length > 1 ? args[1] : SymptomFileWriter.DEFAULT_FILENAME_OUT;
		
		// ==> Param existant ? param : default
		
		SymptomFileReader symptomReader = new SymptomFileReader(fileIn);
		SymptomFileWriter symptomWriter = new SymptomFileWriter(fileOut);
		SymptomAnalyser symptomAnalyser = new SymptomAnalyser();
		
		
		
		// TODO utiliser le reader deja d�velopper plut�t que de le r��crire
		// TODO ecrire une classe sp�cifique sachnat compter les symptomes
		BufferedReader reader = new BufferedReader (new FileReader(fileIn));
		String line = reader.readLine();

		int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}
		
		
		//Ecrire une classe specifique pour �crire le resultat du compte
		// next generate output
		
	}
}
