package utils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfigProperties {
	
	Properties prop=new Properties();

	public readConfigProperties(String propType) {
		try {
			File fileSrc;
			if (propType.equalsIgnoreCase("test")) {
				fileSrc = new File(System.getProperty("user.dir")+"/src/test/resources/appConfigs/testConfig.properties");
			} else {
				fileSrc = new File(System.getProperty("user.dir")+"/src/test/resources/appConfigs/pageObjects.properties");
			}
			FileInputStream fis = new FileInputStream(fileSrc);
	        prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception Occured!! - " + e.toString());
		}
	}

	public String getAppUrl() {
		return prop.getProperty("appUrl");
	}
	
	public String getDataByKey(String keyName)
	{
		return prop.getProperty(keyName);
	}

	public String getBrowserType() {
		return prop.getProperty("browserType");
	}

	public String getBrowserDriver() {
		return prop.getProperty("browserDriver");
	}

	public String getChromeDriverPath() {
		return prop.getProperty("chromeDriverPath");
	}

	public String getGekoDriverPath() {
		return prop.getProperty("gekoDriverPath");
	}
	
	public String getIExplorerDriverPath() {
		return prop.getProperty("ieDriverPath");
	}

}