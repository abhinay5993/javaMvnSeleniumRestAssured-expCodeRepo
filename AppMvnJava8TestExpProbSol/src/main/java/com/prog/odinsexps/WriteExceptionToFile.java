package com.prog.odinsexps;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class WriteExceptionToFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("\nEnter x = ");
			int x = sc.nextInt();
			System.out.println("\nEnter y = ");
			int y = sc.nextInt();
			System.out.println("\nDivision Val : " + (x / y));
		} catch (Exception e) {
			writeMessageToFileByFilePath(e.toString() + " Exception Time " + getSystemDataAndTime(),
					"appTeamBufferedWriter.txt", ".");
		}
	}

	public static String getSystemDataAndTime() {
		Date dtDate = new Date();
		return dtDate.toLocaleString();
	}

	/**
	 * This method use to generate a new file and write data to file at given
	 * fileName, filePath passed by user
	 * 
	 * @param String - msgData - data which has to be written to file
	 * @param String - fileName - File Name to be passed
	 * @param String - filePath - File Path to be passed
	 * 
	 * @return void
	 * 
	 */
	public static void writeMessageToFileByFilePath(String msgData, String fileName, String filePath) {
		try {
			FileOutputStream fileObj = new FileOutputStream(filePath + "//" + fileName, true);
			System.out.println("\nNew File has been created!!..");
			fileObj.write(msgData.getBytes());
			System.out.println("\nData Written to File Successfully..");
			fileObj.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}