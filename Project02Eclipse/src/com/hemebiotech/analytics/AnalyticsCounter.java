package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.util.TreeMap;

public class AnalyticsCounter {
	static BufferedReader symptomsFile;
	final static String pathFile = "C:\\Users\\collo\\IdeaProjects\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt";
	static TreeMap<String, Integer> result = new TreeMap<>();

	public static void main(String[] args) {
		try {
			//We read symptoms
			ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile(pathFile, symptomsFile);
			symptomsFile  = readSymptoms.GetAllSymptoms();
			//We count and increment
			CountSymptom countSymptom = new CountSymptom(symptomsFile, result);
			countSymptom.countAllSymptoms();
			//And we export it !
			WriteSymptom writeSymptom = new WriteSymptom(result);
			writeSymptom.writeSymptomsInFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
