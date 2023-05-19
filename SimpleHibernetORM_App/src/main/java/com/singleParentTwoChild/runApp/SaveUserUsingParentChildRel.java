package com.singleParentTwoChild.runApp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.github.javafaker.Faker;
import com.singleParentTwoChild.mappings.ContractEmployeeDetails;
import com.singleParentTwoChild.mappings.GenEmployee;
import com.singleParentTwoChild.mappings.RegularEmployeeDetails;

public class SaveUserUsingParentChildRel {

	public static void main(String[] args) {
		Faker fkg=new Faker();
		int empId=Integer.valueOf(fkg.bothify("####"));
		String empNameDat=fkg.name().firstName();
		double salAmt=Double.parseDouble(fkg.bothify("#####.##"));
		double bonusAmt=Double.parseDouble(fkg.bothify("#####.##"));
		double ratePerHrsAmt=Double.parseDouble(fkg.bothify("#####.##"));
		long periodsCont=Long.parseLong(fkg.bothify("##"));
		
		//Persistence Object
		GenEmployee genEmpObj=new GenEmployee();
		genEmpObj.setEmpId(empId);
		genEmpObj.setEmpName(empNameDat);
		
		ContractEmployeeDetails contactEmpObj=new ContractEmployeeDetails();
		contactEmpObj.setEmpName(empNameDat);
		contactEmpObj.setRatePerHrsAmount(ratePerHrsAmt);
		contactEmpObj.setPeriod(periodsCont);
		
		RegularEmployeeDetails regEmpObj=new RegularEmployeeDetails();
		regEmpObj.setEmpName(empNameDat);
		regEmpObj.setBonusAmount(bonusAmt);
		regEmpObj.setSalaryAmount(salAmt);
		
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configObj.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t1 = ses.beginTransaction();
		
		ses.save(genEmpObj);
		ses.save(contactEmpObj);
		ses.save(regEmpObj);
		
		t1.commit();
		System.out.println("\nParent-Child Employee data saved into table with discriminator-values ");
		ses.close();
	}

}