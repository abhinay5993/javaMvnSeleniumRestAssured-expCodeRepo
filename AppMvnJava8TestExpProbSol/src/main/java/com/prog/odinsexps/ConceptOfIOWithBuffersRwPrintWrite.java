package com.prog.odinsexps;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

//BufferedReader , BufferedWriter , PrintWriter

public class ConceptOfIOWithBuffersRwPrintWrite {
	public static void main(String[] args) throws IOException {

		//Write Data Usin BufferedWriter
		BufferedWriter buffer = new BufferedWriter(new FileWriter("./appTeamBufferedWriter.txt"));
		buffer.write("Welcome to javaTpoint with BufferedWriter..!!..");
		buffer.close();
		System.out.println("Success");

		//Read Data Using BufferedReader
		BufferedReader br = new BufferedReader(new FileReader("./appTeamBufferedWriter.txt"));
		int i;
		while ((i = br.read()) != -1) {
			System.out.print((char) i);
		}
		br.close();

		//Write data using PrintWriter
		FileWriter  writer      = new FileWriter("./appTeamBufferedWriter.txt");
		PrintWriter printWriter = new PrintWriter(writer);

		printWriter.print(true);
		printWriter.print((int) 123);
		printWriter.print((float) 123.456);
		printWriter.close();
		
	}
}
