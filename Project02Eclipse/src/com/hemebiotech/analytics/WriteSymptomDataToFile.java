package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Classe permettant l'�criture de la liste des symptomes tri�s avec leurs
 * occurences respectives
 * 
 * @author Fouad
 * 
 * @param filepath Attribut de la classe WriteSymptomDataToFile de type String
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	private String filepath;

	/**
	 * 
	 * @param filename Param�tre du constructeur de la Classe pour l'attribut
	 *                 filepath
	 * 
	 */

	public WriteSymptomDataToFile(String filename) {

		this.filepath = filename;
	}

	@Override

	/**
	 * @param symptomsMap Liste utilis�e pour l'�criture des symptomes tri�s et
	 *                    compt�s vers un fichier de sortie
	 * 
	 * @throw IOException Exception lev�e si la liste des ymptomes n'a pu �tre �crit
	 *        dans le ficher de sortie
	 */
	public void writeSymptom(Map<String, Integer> symptomsMap) {

		FileWriter writer = null;
		try {
			writer = new FileWriter(filepath);
			for (Entry<String, Integer> entry : symptomsMap.entrySet()) {
				writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("erreur lors de l'�criture des symptomes dans le fichier de sortie");

		}
	}

}
