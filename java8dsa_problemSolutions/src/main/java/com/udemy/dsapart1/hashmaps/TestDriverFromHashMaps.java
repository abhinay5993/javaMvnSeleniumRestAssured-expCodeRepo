package com.udemy.dsapart1.hashmaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * This class act as driver code to start execution via main() for HashMap
 * examples.
 * 
 */
public class TestDriverFromHashMaps {
	
	public static void main(String[] args) {
	Map hash1Map=new HashMap<>();
	hash1Map.put("clr","Value-AL");
	hash1Map.put("01","IBM");
	hash1Map.put(null,500);
	hash1Map.put(2,"(*(#*($*");
	hash1Map.put(3.99,9999);
	hash1Map.put(null,-777);
	System.out.println("\nNewly created HashMap status : "+hash1Map);
	System.out.println("\nSize of HashMap / No of elements : "+hash1Map.size());
	System.out.println("\nCheck key exits in hashMap : "+hash1Map.containsKey(null));
	System.out.println("\nCheck value exits in hashMap : "+hash1Map.containsValue(9999));
	System.out.println("\nCheck value -1 exits in hashMap : "+hash1Map.containsValue(-1));
	System.out.println("\nGet hashcode of hashMap : "+hash1Map.hashCode());
	
	//Iteration over hashMap.
    Set<Entry> entrySetRef=hash1Map.entrySet();
    //Using filter on-top of collections
    entrySetRef.parallelStream()
               .filter(t->t.getKey()!=null)
               .forEach(t ->
    System.out.println("\nKey : "+t.getKey()+"=>hashcode : "+t.getKey().hashCode()+" --> Value : "+t.getValue()+" ")
    );
    
    //Time complexity is constant - O(1) - to access element
    System.out.println("\nAccess element using key : "+hash1Map.get(null));
    
	}

}