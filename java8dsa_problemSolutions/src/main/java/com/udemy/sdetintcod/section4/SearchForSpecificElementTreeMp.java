package com.udemy.sdetintcod.section4;
import java.util.Map;
import java.util.TreeMap;

public class SearchForSpecificElementTreeMp {

	public static void main(String[] args) {
	Map<Integer,String> strLnkHm = null;
	String strTargetValue="Aslam";
	checkValuesStatusIntoMap(strLnkHm,strTargetValue);
	String strTargetValue1="Disha";
	checkValuesStatusIntoMap(strLnkHm,strTargetValue1);
	}

	private static void checkValuesStatusIntoMap(Map<Integer, String> strTreeMp,String strTargetValue) {
		strTreeMp=new TreeMap<>();
		strTreeMp.put(101,"Abhinay");
		strTreeMp.put(106,"Atif");
		strTreeMp.put(155,"Disha");
		strTreeMp.put(108,"Subham");
		strTreeMp.put(120,"Rupam");
		strTreeMp.put(20,"Susmita");
		strTreeMp.put(140,"KK");
		System.out.println("\nEmployee Directory : "+strTreeMp);
		if(strTreeMp.containsValue(strTargetValue)) {
			System.out.println("\nValue : "+strTargetValue+" present.");
		} else {
			System.out.println("\nValue not found!..");
		}
	}
	

}