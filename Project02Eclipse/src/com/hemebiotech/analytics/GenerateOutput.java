package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class GenerateOutput implements ISymptomWriter {
	/**
	 * fichier assign�
	 */
	private String outPutFile;

	public GenerateOutput(String outputfile) {
		this.outPutFile = outputfile;
	}

	/**
	 * �crire le r�sultat dans un fichier apr�s l'avoir compt� et tri� � partir de
	 * la classe CountAndOrderSymptoms/ Write result to file after counting and
	 * sorting it from the CountAndOrderSymptoms class
	 * @writeSymptoms �crire le r�sultat dans un fichier apr�s l'avoir compt� et tri� � partir dela classe CountAndOrderSymptoms
	 * @compteurs Nous le prenons pour prendre sa taille et l'utilisons pour�crire les sympt�mes 
	 */
	public void writeSymptoms(Map<String, Integer> compteurs) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(outPutFile));) {
			
			for (Map.Entry<String, Integer> k : compteurs.entrySet()) {
				System.out.println(k.getKey() + " " + k.getValue());
				writer.println(k.getKey() + " " + k.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
