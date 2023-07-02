package com.singleParentTwoChild.mappings;

/*
 *
 * @Entity
 * @Table(name="emp1")
 * @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
 * @DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
 * @DiscriminatorValue(value="EMP")
 * 
 * @Id
 * @GenericGenerator(name="xyz",strategy="increment")
 * @GeneratedValue(generator="xyz")
 * @Column(name="id")
 * @Column(name="name")
 * 
 */

public class GenEmployee {
	
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}