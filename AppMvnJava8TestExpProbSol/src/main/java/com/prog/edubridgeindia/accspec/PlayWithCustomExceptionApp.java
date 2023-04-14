package com.prog.edubridgeindia.accspec;

/*
 * Solve: case study: if age<18 InValidVoterException
 * If age>18 && age age<65
 * PerfectVoterException
 * If age>65
 * UselessVoterException
 * 
 */

public class PlayWithCustomExceptionApp {

	public static void main(String[] args) {
		try {
			checkVotersEligiblity(10);
		} catch (InValidVoterException | PerfectVoterException | UselessVoterException e) {
			System.out.println(e);
		}
	}
	
	private static void checkVotersEligiblity(int inpAge)
			throws InValidVoterException, PerfectVoterException, UselessVoterException {
		if (inpAge < 18) {
			throw new InValidVoterException("InValid Voter Exception!!..");
		} else if (inpAge > 18 && inpAge < 65) {
			throw new PerfectVoterException("Perfect Voter Exception!!..");
		} else {
			throw new UselessVoterException("Useless Voters Exception!!...");
		}
	}

}