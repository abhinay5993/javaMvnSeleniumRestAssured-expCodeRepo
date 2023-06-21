package com.edubridge.designaptapps.abstractfactorypat;

public class ServerFactoryClsImpl implements ComputerAbstractFactoryInter {

	private String ramSize;
	private String hddCap;
	private String cpuConfig;
	
	public ServerFactoryClsImpl(String ramSize, String hddCap, String cpuConfig) {
		super();
		this.ramSize = ramSize;
		this.hddCap = hddCap;
		this.cpuConfig = cpuConfig;
	}

	@Override
	public ServerNodePcCls createComputers() {
		return new ServerNodePcCls(ramSize, hddCap, cpuConfig);
	}

}