package com.udemy.sdetintcod.section4;
import java.util.LinkedHashMap;
import java.util.Map;

public class SearchForSpecificElementLinkedHm {

	public static void main(String[] args) {
	Map<Integer,String> strLnkHm = null;
	String strTargetValue="Aslam";
	checkValuesStatusIntoMap(strLnkHm,strTargetValue);
	String strTargetValue1="Disha";
	checkValuesStatusIntoMap(strLnkHm,strTargetValue1);
	}

	private static void checkValuesStatusIntoMap(Map<Integer, String> strLnkHm,String strTargetValue) {
		strLnkHm=new LinkedHashMap<>();
		strLnkHm.put(101,"Abhinay");
		strLnkHm.put(102,"Atif");
		strLnkHm.put(105,"Disha");
		strLnkHm.put(108,"Subham");
		strLnkHm.put(110,"Rupam");
		strLnkHm.put(120,"Susmita");
		strLnkHm.put(140,"KK");
		System.out.println("\nEmployee Directory : "+strLnkHm);
		if(strLnkHm.containsValue(strTargetValue)) {
			System.out.println("\nValue : "+strTargetValue+" present.");
		} else {
			System.out.println("\nValue not found!..");
		}
	}
	

}