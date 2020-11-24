package com.hemebiotech.analytics;

import java.util.Hashtable;
import java.util.List;

public class SymptomsSort implements ISymptomSort {

    /**
     * Function who count the number of recurrences of symptoms and sort them by key : name of symptoms and by value : number of recurrences.
     * @param list
     */
    public Hashtable<String, Integer>  CleanSymptomsList(List<String> list){
        Hashtable<String, Integer> listClean = new Hashtable<>();

        for(String symptoms : list) {
            if (listClean.isEmpty()) {
                listClean.put(symptoms, 1);
            } else if (listClean.containsKey(symptoms)) {
                int old = listClean.get(symptoms);
                listClean.put(symptoms,old+ 1);
            } else {
                listClean.put(symptoms, 1);
            }
        }
        return listClean;
    }
}
