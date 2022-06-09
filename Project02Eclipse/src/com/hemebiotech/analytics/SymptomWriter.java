package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * 
 * 
 * 
 * 
 * Dans cette classe SymptomWriter nous allons une m�thode qui produira un
 * fichier dans lequel il est retranscri le contenu du dictionnaire.
 * 
 * 
 * 
 * 
 * @author El Ouaryaghli
 * @version 1.0
 * 
 */

public class SymptomWriter {

	/**
	 * Apr�s avoir renseign� le chemin avec que le nom du fichier r�sultat et apr�s
	 * avoir instanci� le dictionnaire � retranscrire, cette methode produit un
	 * fichier avec le contenu du dicttionnaire.
	 * 
	 * 
	 * @param path         Chemin d'acc�s du fichier � produire
	 * 
	 * @param symptomeNbre Dictionnaire de cl�, valeur : String , Integer.
	 * 
	 * @throws IOException Exception d'entr�e/sortie (E/S) car on va �crire dans un
	 *                     fichier qui pourrait ne pas exister
	 * 
	 * 
	 */

	public static void CreatFiles(String path, Map<String, Integer> symptomeNbre) throws IOException {

		FileWriter writer = new FileWriter(path); // g�n�ration du fichier dans le chemin renseigner

		for (Map.Entry<String, Integer> entry : symptomeNbre.entrySet()) // on parcours le dictionnaire
		{
//			printEntry(entry); // on affiche l'ensemble de son contenu

			try {
				writer.write("There is " + entry.getValue() + " " + entry.getKey() + "\n"); // �criture dans le fichier
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		writer.close();

	}

	// methode permettant d'afficher une entr�e d'un dictionnaire
//	private static void printEntry(Map.Entry entry) {
//		System.out.println(entry.getKey() + " -> " + entry.getValue());
//
//	}

}
