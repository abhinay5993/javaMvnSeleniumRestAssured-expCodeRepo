package com.prog.edubridgeindia.accspec;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyWordExampleApp {

	public static void main(String[] args) {
		try {
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

	public static void readFile() throws FileNotFoundException {
		FileReader fileReader=new FileReader(".//appTeamBufferedWriter.txt");
		throw new FileNotFoundException("File is not found!!!!");// termination

	}

}