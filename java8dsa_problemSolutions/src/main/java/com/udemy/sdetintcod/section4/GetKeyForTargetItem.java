package com.udemy.sdetintcod.section4;
import java.util.HashMap;
import java.util.Map;

public class GetKeyForTargetItem {

	public static void main(String[] args) {
	Map<String,String> capitalMap=new HashMap<>();
	capitalMap.put("HYD","Telengan");
	capitalMap.put("Vizak","Andharpradesh");
	capitalMap.put("Chennai","Tamil Nadu");
	capitalMap.put("Mumbai","Maharshtra");
	capitalMap.put("Kolkata","West Bengal");
	capitalMap.put("Kathmandu","Nepal");
	capitalMap.put("POK","Pakisthan");
	
	String strTarget="West Bengal";
	getKeyForTragetItem(capitalMap,strTarget);
	
	String str2Target="Atif";
	getKeyForTragetItem(capitalMap,str2Target);
	}

	private static void getKeyForTragetItem(Map<String, String> capitalMap, String strTarget) {
		boolean statusFlg = false;
		for (Map.Entry<String,String> entry : capitalMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			if (val.equalsIgnoreCase(strTarget)) {
			System.out.println("\nThe value : '"+strTarget+"' present at key : "+key+"");
			statusFlg=true;
			break;
			}
		}
		
		if (!statusFlg) {
			System.out.println("\nUnable to get the key!!..");
		}
		
	}

}