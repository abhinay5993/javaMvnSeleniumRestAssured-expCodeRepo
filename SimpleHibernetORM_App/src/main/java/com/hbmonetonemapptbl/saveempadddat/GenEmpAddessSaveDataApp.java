package com.hbmonetonemapptbl.saveempadddat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.github.javafaker.Faker;
import com.hbmonetonemapptbl.mappojo.AddressDetails;
import com.hbmonetonemapptbl.mappojo.EmployeeDetails;

public class GenEmpAddessSaveDataApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Faker fkg=new Faker();
		String empNameDat=fkg.name().fullName();
		String pinCode=fkg.address().zipCode();
		String laneNo=fkg.address().streetName();
		String cityName=fkg.address().city();
		String stateName=fkg.address().state();
		
		//Set Emp Details
		EmployeeDetails empDetObj=new EmployeeDetails();
		empDetObj.setEmpName(empNameDat);
		
		//set address deatils
		AddressDetails addrDetObj=new AddressDetails();
		addrDetObj.setAddPinCode(pinCode);
		addrDetObj.setLaneno(laneNo);
		addrDetObj.setCity(cityName);
		addrDetObj.setState(stateName);
		
		empDetObj.setAddressDetails(addrDetObj);
		addrDetObj.setEmployeeDetails(empDetObj);
		
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");
		
		SessionFactory sf = configObj.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t1 = ses.beginTransaction();
		
		ses.save(empDetObj);
		t1.commit();
		System.out.println("\nEmplyee & Addess!!.. data saved to table..");
		ses.close();
		
	}

}