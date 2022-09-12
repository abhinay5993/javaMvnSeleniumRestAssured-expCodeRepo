package com.empms.services;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.empms.model.Employee;

public class EmployeeImpl implements Employee1 {

	private SessionFactory factory;

	// setter injection
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void insertData(Employee e) {
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(e);
		tx.commit();
	}

}
