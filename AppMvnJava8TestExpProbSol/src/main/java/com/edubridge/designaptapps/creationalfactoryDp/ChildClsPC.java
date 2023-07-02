package com.edubridge.designaptapps.creationalfactoryDp;

public class ChildClsPC extends ComputerAbsCls {

	private String ram;
	private String hdd;
	private String cpu;

	public ChildClsPC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.getRam();
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.getHdd();
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.getCpu();
	}

	public String getRam() {
		return ram;
	}

	public String getHdd() {
		return hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

}