package com.edubridge.designaptapps.creationalfactoryDp;

public class ComputerAppFactoryCls {

	//Bean / Factory methode as getComputerInstance() return type is class type.
	public static ComputerAbsCls getComputerInstance(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new ChildClsPC(ram, hdd, cpu);
		} else if ("SER".equalsIgnoreCase(type)) {
			return new ServerNodePcCls(ram, hdd, cpu);
		} else {
			return null;
		}
	}

}