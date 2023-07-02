package com.edubridge.designaptapps.abstractfactorypat;

public class ComputerAbsFactoryCls {

	public static ComputerAbsCls getComputersIns(ComputerAbstractFactoryInter interfaceRef) {
		return interfaceRef.createComputers();
	}
}
