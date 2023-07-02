package com.edubridge.designaptapps.abstractfactorypat;

public class PCFactoryClsImpl implements ComputerAbstractFactoryInter {

	private String ramSize;
	private String hddCap;
	private String cpuConfig;
	
	public PCFactoryClsImpl(String ramSize, String hddCap, String cpuConfig) {
		this.ramSize = ramSize;
		this.hddCap = hddCap;
		this.cpuConfig = cpuConfig;
	}

	@Override
	public ChildClsPC createComputers() {
		return new ChildClsPC(ramSize, hddCap, cpuConfig);
	}

}
