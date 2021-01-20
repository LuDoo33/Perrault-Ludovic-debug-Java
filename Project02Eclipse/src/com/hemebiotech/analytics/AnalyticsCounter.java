package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;

public class AnalyticsCounter {
	private static int headacheCount = 0; // initialize to 0
	// private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0
	private static Object mapkey;
	private static Integer mapvalue;

	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		String line = reader.readLine();
		TreeMap treemapsymptom = new TreeMap<String, Integer>();
		mapkey = line;
		mapvalue = 0;
		int i = 0; // set i to 0
		// FileWriter writer2 = new FileWriter("result2.out");
		// writer2.write("symptom" + line + "\n");
		FileWriter writermap = new FileWriter("resulta.out");

		while (line != null) {
			i++; // increment i
			System.out.println("symptom from file: " + line + " " + i);
			// statut = false;

			if (treemapsymptom.containsKey(line)) {

				Integer mavaleur = (Integer) treemapsymptom.get(line);
				Integer neovaleur = Integer.valueOf(mavaleur.intValue() + 1);
				System.out.println("symptom existant: " + line + " " + neovaleur);
				treemapsymptom.replace(line, neovaleur);
				mapvalue = neovaleur;
			} else {
				treemapsymptom.put(line, Integer.valueOf(1));
				System.out.println("symptom inexistant: " + line + " " + Integer.valueOf(1));
				mapvalue = Integer.valueOf(1);
			}
			System.out.println("symptom actuel from file: " + mapkey);
			// FileWriter writermap = new FileWriter("resulta.out");
			writermap.write("headache: " + line + " " + mapvalue + " un " + i + "\n");
			// writermap.write("headache: " + mapkey + " " + mapvalue + " un " + i + "\n");
			if (line.equals("headache")) {
				headacheCount++;
				System.out.println("number of headaches: " + headacheCount);
			}
			// else if (line.equals("rash")) {
			// rashCount++;
			// }
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine(); // get another symptom
			mapkey = line;

		}
		if (line == null) {

			reader.close();
		}
		// next generate output
		// Afficher le contenu du MAP

		FileWriter writer = new FileWriter("result.out");
		writer.write("headache: " + mapkey + " " + mapvalue + " hg " + i + "\n");
		writer.write("headache: " + headacheCount + " " + i + "\n");
		writer.write("headache: " + headacheCount + "\n");
		// writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writermap.close();
		// writermap.close();
		while (0 != treemapsymptom.size()) {
			// while (null != treemapsymptom.f()) {NoSuchElementException
			System.out.println(
					"symptom : " + treemapsymptom.firstKey() + " " + treemapsymptom.get(treemapsymptom.firstKey()));
			writer.write("symptom : " + treemapsymptom.firstKey() + " " + treemapsymptom.get(treemapsymptom.firstKey())
					+ "\n");
			treemapsymptom.remove(treemapsymptom.firstKey());

		}
		writer.close();
	}
}
