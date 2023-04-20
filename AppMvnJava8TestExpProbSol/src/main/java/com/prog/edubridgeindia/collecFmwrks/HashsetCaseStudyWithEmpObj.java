package com.prog.edubridgeindia.collecFmwrks;
import java.util.HashSet;

public class HashsetCaseStudyWithEmpObj {

	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(101, 30, 80000, "Varchas");
		Employee e2 = new Employee(102, 31, 81000, "Ajay");
		hs.add(e1);
		hs.add(e2);
		for (Employee e : hs) {
			System.out.println(e.eid + " " + e.ename + "" + e.age + "" + e.salary);
		}

	}

}

class Employee {
	int eid, age, salary;
	String ename;

	public Employee(int eid, int age, int salary, String ename) {
		super();
		this.eid = eid;
		this.age = age;
		this.salary = salary;
		this.ename = ename;
	}

}