package util;

import java.util.List;

import obj.ListSymptoms;
import obj.Symptom;

public class AnalyseSymptomsFromList implements ISymptomsAnalyser {

	private List<String> liste;

	public AnalyseSymptomsFromList(List<String> liste) {
		this.liste = liste;
	}

	@Override
	public ListSymptoms AnalyseSymptoms() {

		// Je cr�e ma liste de symptomes vide
		ListSymptoms result = new ListSymptoms();

		// Je parcours ma liste de Strings lue
		for (String s : this.liste) {

			if (result.getListSymptoms().isEmpty()) {
				// liste vide : 1�re ligne (= comme pas trouv�)
				String nom = s; // Donc r�cup�rer ligne lue
				Symptom symptomeAAjouter = new Symptom(nom, 1);
				result.addNewSymptom(symptomeAAjouter);
			} else {
				// liste pas vide
				Symptom symptomeCourant = result.searchInStringList(s);

				if (symptomeCourant != null) {
					// si trouv�
					result.increaseNumberOfSymptom(symptomeCourant);
				} else {
					// pas trouv�
					String nom = s; // Donc r�cup�rer ligne lue
					Symptom symptomeAAjouter = new Symptom(nom, 1);
					result.addNewSymptom(symptomeAAjouter);
				}
			}
		}

		result.sort();

		return result;
	}

}
