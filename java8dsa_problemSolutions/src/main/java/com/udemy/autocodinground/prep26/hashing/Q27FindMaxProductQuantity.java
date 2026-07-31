package com.udemy.autocodinground.prep26.hashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q27FindMaxProductQuantity {

	public static void main(String[] args) {
	String[] strProductCatalog={"xyz 9","abc 20","xyz 21","test 56","abc 60"};
	getMaximumQuanityOfProduct(strProductCatalog);
	}

	private static void getMaximumQuanityOfProduct(String[] strProductCatalog) {
		System.out.println("\nInput data Array : " + Arrays.toString(strProductCatalog));
		int arrLen = strProductCatalog.length;
		if (strProductCatalog == null || arrLen == 0) {
			System.err.println("\nOperation not!! possible..");
			return;
		}
		Map<String, Integer> hashMap = new HashMap<>();
		for (String strArrItems : strProductCatalog) {
			String[] strProductQuant = strArrItems.split(" ");
			String strProductName = strProductQuant[0];
			int prodQuantity = Integer.parseInt(strProductQuant[1]);
			hashMap.put(strProductName, hashMap.getOrDefault(strProductName, 0) + prodQuantity);
		}
		int maxProdQuant = Integer.MIN_VALUE;
		String strProductName = "";
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() > maxProdQuant) {
				strProductName = entry.getKey();
				maxProdQuant = entry.getValue();
			}
		}
		System.out.println("\nMaximum quantity of product : " + strProductName + " => " + maxProdQuant + " ");
	}

}