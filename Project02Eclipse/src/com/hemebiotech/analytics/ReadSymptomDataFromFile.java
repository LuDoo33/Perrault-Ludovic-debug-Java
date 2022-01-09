package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant la lecture des symptomes dans un fichier � partir d'un
 * chemin d'acc�s impl�mentant l'interface ISymptom reader
 * 
 * @author Fouad
 * 
 * @param filepath Attribut de la classe ReadSymptomDataFromFile de type String
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * 
	 * @param filepath Param�tre du constructeur de la Classe pour l'attribut
	 *                 filepath
	 *
	 * 
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override

	/**
	 * 
	 * @param filepath Chemin d'acc�s vers le fichier dans lequel seront lu les
	 *                 symptomes
	 * 
	 * @param line     Variable stockant la chaine de caract�res lu pour chaque
	 *                 ligne du fichier
	 * 
	 * @return result Un tableau contenant les symptomes lu dans le fichier
	 * 
	 * @throw IOException Exception lev�e si le fichier source n'a pu �tre lu
	 */

	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("erreur lors de la lecture des symptomes dans le fichier en entr�e");

			}
		}

		return result;
	}

}
