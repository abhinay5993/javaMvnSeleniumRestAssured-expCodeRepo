package com.problemsolving.testUtilExps;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfigData {
	
	Properties prop;
	
	public readConfigData() {
		try {
			File src = new File("./configPack/testConfigs.properties");
			FileInputStream fisObj = new FileInputStream(src);
			prop = new Properties();
			prop.load(fisObj);
		} catch (Exception e) {
			System.out.println("\nException due to : " + e.toString());
		}
	}

	public String getAppURL() {
		return prop.getProperty("appURL");
	}

	public String getUserName() {
		return prop.getProperty("userName");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}

	public String getChromeDriverPath() {
		return prop.getProperty("chromeDriverPath");
	}

	public String getFireFoxDriverPath() {
		return prop.getProperty("fireFoxDriverPath");
	}

}