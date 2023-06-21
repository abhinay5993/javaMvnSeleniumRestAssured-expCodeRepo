package com.edubridge.designaptapps.abstractfactorypat;

public abstract class ComputerAbsCls {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "ComputerAbsCls [ RAM : " + this.getRAM() + ",  HDD : " + this.getHDD() + ",  CPU : " + this.getCPU() + "]";
	}
	
}