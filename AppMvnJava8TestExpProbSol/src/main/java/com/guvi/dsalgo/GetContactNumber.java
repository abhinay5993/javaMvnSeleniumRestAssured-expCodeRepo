package com.guvi.dsalgo;
import java.util.ArrayList;
import java.util.List;

public class GetContactNumber {
	private String mobileNo;
	private String personName;
	static List<GetContactNumber> contactData;
	
	public GetContactNumber(String perName, String mobileNo) {
		if (mobileNo.length() > 10 || mobileNo.length() <= 12) {
			this.mobileNo = mobileNo;
		} else {
			System.out.println("\nMobile No Invalid!!!");
		}
		this.personName = perName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public static void getMobileNoByNameSearch(String string) {
		String getResMobileNo = null;
		for(int i=0;i<contactData.size();i++)
		{
			if(contactData.get(i).getPersonName().equals(string))
			{
				getResMobileNo=contactData.get(i).getMobileNo();
				break;
			}
		}
		System.out.println("\nFeatched Mobile No : "+getResMobileNo);
	}
	
	public static void main(String[] args) {
	contactData=new ArrayList<>();
	contactData.add(new GetContactNumber("atdi","23432343343"));
	contactData.add(new GetContactNumber("atif","9566089853"));
	contactData.add(new GetContactNumber("kk","9534089853"));
	contactData.add(new GetContactNumber("abhi","9534089853"));
	contactData.add(new GetContactNumber("noor","976089853"));
	contactData.add(new GetContactNumber("kk","9138879853"));
	contactData.add(new GetContactNumber("utam","9564678453"));
	
	for(int i=0;i<contactData.size();i++)
	{
	System.out.print("\nPerson Name : "+contactData.get(i).getPersonName()+"--> Mobile No : "+contactData.get(i).getMobileNo());	
	}
	
	getMobileNoByNameSearch("kk");
	}
	
}