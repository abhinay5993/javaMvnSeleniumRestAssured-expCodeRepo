package com.libms.bean;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.query.Query;

@Entity
@Table(name="admin_info")
@DynamicUpdate
public class AdminUsers {

	@Column(name="ad_userName")
	private String userName;
	
	@Column(name="ad_password")
	private String password;

	private SessionFactory sessionFactIns;
	
	public SessionFactory getSessionFactIns() {
		return sessionFactIns;
	}

	public void setSessionFactIns(SessionFactory sessionFactIns) {
		this.sessionFactIns = sessionFactIns;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	public List<AdminUsers> getAllAdminUsers() {
		Session sesObj = getSessionFactIns().openSession();
		CriteriaBuilder ctBuild = sesObj.getCriteriaBuilder();
		javax.persistence.criteria.CriteriaQuery<AdminUsers> ctq = ctBuild.createQuery(AdminUsers.class);
		Root<AdminUsers> root = ctq.from(AdminUsers.class);

		javax.persistence.criteria.CriteriaQuery<AdminUsers> ctq2 = ctq.select(root);
		Query<AdminUsers> query = sesObj.createQuery(ctq2);
		List<AdminUsers> listObj = query.getResultList();
		return listObj;
	}
	
	//db validation for valid user
	public boolean performAdminLogin(String userName, String password) {
		boolean flagVal = false;
		
		for (int i = 0; i < getAllAdminUsers().size(); i++) {
			String listUserId = getAllAdminUsers().get(i).getUserName();
			String listPwd = getAllAdminUsers().get(i).getPassword();
			if (listUserId.equals(userName) && listPwd.equals(password)) {
				flagVal = true;
				break;
			}
		}
		return flagVal;
	}
	
}