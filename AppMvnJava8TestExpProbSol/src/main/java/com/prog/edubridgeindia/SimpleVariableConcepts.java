package com.prog.edubridgeindia;

public class SimpleVariableConcepts {
	
	protected int empId,empAge; // Instance variable
	static int empSalary;  // static variable
	
	public static void main(String[] args) {
		SimpleVariableConcepts insObj=new SimpleVariableConcepts();
		SimpleVariableConcepts insObj1=new SimpleVariableConcepts();
		insObj.empAge=28;
		insObj.empId=101;
		SimpleVariableConcepts.empSalary=500000;
		System.out.println("\nValue of empId : "+insObj.empId);
		System.out.println("\nValue of empAge : "+insObj.empAge);
		System.out.println("\nValue of Salary : "+empSalary);
		// Re-initialization of Static variable
		insObj.empSalary=70000;
		System.out.println("\nNew value of static Salary : "+empSalary);
		insObj1.empAge=19;
		insObj1.empId=47384;
		SimpleVariableConcepts.empSalary=10000;
		System.out.println("\nValue of insObj1 new empId : "+insObj1.empId);
		System.out.println("\nValue of insObj1 empAge : "+insObj1.empAge);
		System.out.println("\nValue of insObj1 Salary : "+empSalary);
		System.out.println("\nObject instace insObj values - "+insObj);
		System.out.println("\nObject instace insObj1 values - "+insObj1);
	}

	@Override
	public String toString() {
		return "SimpleVariableConcepts [empId=" + empId + ", empAge=" + empAge + "]";
	}

}
