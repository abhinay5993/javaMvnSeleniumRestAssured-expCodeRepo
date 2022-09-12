package com.empms.beans;
import com.empms.model.Employee;
import com.empms.services.Employee1;
import com.empms.services.EmployeeImpl;

public class EmployeeBean implements Employee1 {

	private EmployeeImpl es;

	public void setEs(EmployeeImpl es) {
		this.es = es;
	}

	@Override
	public void insertData(Employee e) {
		es.insertData(e);
	}

}
