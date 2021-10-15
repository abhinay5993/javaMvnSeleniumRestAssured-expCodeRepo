package utils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CommonUtils {
	
	static Random random = new Random();   
	static // Generates random integers 0 to 999  
	int rand = random.nextInt(10000);   
	
	public static final String DATE_TIME_FMT="ddMMyyyyhhmmss";
	public static String screenShotPath="./src/test/resources/screenShotSrc/amzScreen_"+rand+".png";
	
	public static void takeScreenCapture(WebDriver driver) throws IOException {
		File scrCap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrCap,new File(screenShotPath));
		Reporter.log("<br><img src='"+screenShotPath+"' height='569' weidth='1366'/>screenShots</br>");
	}

	public static String getCurrentSystemDataTime() {
		SimpleDateFormat df = new SimpleDateFormat(DATE_TIME_FMT);
		Date dat = new Date();
		return String.valueOf(df.format(dat));
	}
	
}