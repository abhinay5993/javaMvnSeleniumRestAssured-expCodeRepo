package com.prog.edubridgeindia.jdbconnects;
import java.util.ResourceBundle;

public class AccessResourceBundles {

	public int getLoginStatus(String userName, String pass) {
		ResourceBundle resbdl = ResourceBundle.getBundle("mainAppsConfig");
		String confUserName = resbdl.getString("userName");
		String confPwd = resbdl.getString("password");
		int statusCode = (confUserName.equals(userName) && confPwd.equals(pass)) ? 1 : 0;
		return statusCode;
	}

	public int findMaxOfThreeNums() {
		ResourceBundle resbdl = ResourceBundle.getBundle("mainAppsConfig");
		int num1= Integer.parseInt(resbdl.getString("n1"));
		int num2= Integer.parseInt(resbdl.getString("n2"));
		int num3= Integer.parseInt(resbdl.getString("n3"));
		int maxNum = (num1>num2 && num1>num3)?num1:(num2>num3)?num2:num3;
		return maxNum;
	}
	
	
	public int getMaxNumberfromArray(int[] dataItems) {
		int maxNum = dataItems[0];
		for (int i = 0; i < dataItems.length; i++) {
			if (dataItems[i] >= maxNum) {
				maxNum = dataItems[i];
			}
		}
		return maxNum;
	}
	
	public int getMaxNumber2Array(int[] dataItems) {
		int maxNum = dataItems[0];
		for (int x:dataItems) {
			maxNum=(x >= maxNum)?x:maxNum;
		}
		return maxNum;
	}
	
	
}