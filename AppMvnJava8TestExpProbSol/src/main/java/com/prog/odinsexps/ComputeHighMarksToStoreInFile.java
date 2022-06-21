package com.prog.odinsexps;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ComputeHighMarksToStoreInFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Compute Maximum Marks and its subject Name
		System.out.print("\nEnter No Of Subjects : ");
		int noOfSubjects=sc.nextInt();
		String maxMsgVal=computeHighestMarksBySubject(noOfSubjects);
		System.out.println(maxMsgVal);
		
		//Write Data to file at given FileName and FilePath
		System.out.println("\nEnter File Name : ");
		String fileName=sc.next();
		System.out.println("\nEnter File Path : ");
		String filePath=sc.next();
		writeMessageToFileByFilePath(maxMsgVal, fileName, filePath);
	}
	
	
	/**
	 * This method use to compute maximum highest marks for given No of subjects.
	 * 
	 * @param int - noOfSubjects
	 * @return String - resultData as message of maximum highest marks with
	 *         corresponding subject Name
	 * 
	 */
	public static String computeHighestMarksBySubject(int noOfSubjects) {
		String resultData = "";
		String subjectName[] = new String[noOfSubjects];
		double subjectMarks[] = new double[noOfSubjects];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < noOfSubjects; i++) {
			System.out.print("\nPlease Enter Subject Name : ");
			subjectName[i] = sc.next();
			System.out.println("\nPlease Enter Subject Marks : ");
			subjectMarks[i] = sc.nextDouble();
		}

		double maxMarks = subjectMarks[0];
		int maxSubIndex = 0;
		for (int i = 0; i < noOfSubjects; i++) {
			if (subjectMarks[i] > maxMarks) {
				maxMarks = subjectMarks[i];
				maxSubIndex = i;
				break;
			}
		}
		resultData = "Highest marks in " + subjectName[maxSubIndex] + "  are : " + maxMarks + "";
		return resultData;
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