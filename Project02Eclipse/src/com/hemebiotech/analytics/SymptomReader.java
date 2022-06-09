package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * 
 * Dans cette classe SymptomReader nous allons une utiliser 2 m�thodes, la
 * premi�re produira une liste de personnes trait� tandis que la seconde
 * determinera le nombre de symptomes existant.
 * 
 * @author El Ouaryaghli
 * @version 1.0
 * 
 */

public class SymptomReader {

	/**
	 * A partir du chemin du fichier source cette methode produit une ArrayList de
	 * chaine de caract�re contenu, ligne par ligne, dans le fichier source. Dans
	 * cette m�thode on lira ligne par ligne le contenu d'un fichier source situ�
	 * dans le chemin "path". Puis on affectera les chaines de caract�res de chacune
	 * de ces lignes du fichier dans une List. Ainsi dans la List on aura une copie
	 * de tous les chaines de caract�res avec toutes les redondances, ce qui nous
	 * permettra de conna�tre la totalit� des lignes non vide sans avoir � utiliser
	 * un compteur mais en utilisant juste la m�thode size(). Nous pourraons par la
	 * suite avoir acc�s aux information du fichier sans avoir � le lire de nouveau.
	 * 
	 * @param path Chemin d'acc�s du fichier source
	 * @return symptomesLst Liste des chaines de caract�res qui peut contenir des
	 *         duplications
	 * @throws IOException Exception d'entr�e/sortie (E/S) car on va lire un fichier
	 *                     qui pourrait ne pas exister
	 */

	public static List<String> ReadFiles(String path) throws IOException {

		List<String> symptomesLst = new ArrayList<String>(); // cr�ation d'un ensemble o� sera repertorier tous les
																// symboles

		// Iterator<String> it = symptomes.iterator(); // it�rateur pour obtenir les
		// �l�ments d'un ensemble

		FileReader fileReader = new FileReader(path); // Cr�ation d�un fileReader pour lire le fichier
		BufferedReader reader = new BufferedReader(fileReader);

		try {

			String line = reader.readLine(); // lecture de la ligne courante
			// et affectation de la donn�e de cette ligne � la variable "line"
			while (line != null) {
				// symptomes.add(line); // remplissage de l'ensemble symptomes
				symptomesLst.add(line); // remplissage de la liste symptome
				line = reader.readLine(); // lecture de la prochaine ligne
			}
		} catch (

		IOException e) {
			e.printStackTrace();
		}
		reader.close(); // FIN DE LA LECTURE DU FICHIER

		return symptomesLst; // RETOUR DE LA LISTE DES SYMPTOMES QUI PEUT CONTENIR DES DUPLICATIONS
	}

	/**
	 * 
	 * A partir d'une liste de chaine de caract�res fournit par une List cette
	 * methode produira un ensemble de chaine de caract�re toute en �l�minant les
	 * redondances pr�sente dans la List.
	 * 
	 * 
	 * @param symptomesLst Liste des chaines de caract�res qui peut contenir des
	 *                     duplications
	 * @return symptomes ensemble de chaine de caract�res (il n'y a plus de
	 *         duplications).
	 */

	// CETTE METHODE NOUS PERMETTRA D'AVOIR UN ENSEMBLE CONTENANT LES SYMPTOMES SANS
	// REPETITION
	public static Set<String> symptomes(List<String> symptomesLst) {
		Set<String> symptomes = new HashSet<String>();
		for (int i = 0; i < symptomesLst.size(); i++) { // ON PARCOURS LA LISTE DES SYMPTOMES
			symptomes.add(symptomesLst.get(i)); // ON LES AFFECTE DANS UN ENSEMBLE
		}
		return symptomes; // RETOUR DE L'ENSEMBLE DE SYMPTOMES (IL N'Y A PLUS DE DUPLICATIONS)

	}

}
