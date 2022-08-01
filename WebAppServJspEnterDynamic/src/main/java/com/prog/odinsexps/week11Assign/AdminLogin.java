package com.prog.odinsexps.week11Assign;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLogin {

	//db validation for valid user
	public boolean performAdminLogin(String userName, String password) throws ClassNotFoundException, SQLException {
		boolean flagVal = false;
		UserContactDbManagerDAo.getInstanceOfDBManager().setPrepStatement(UserContactDbManagerDAo.SELECT_ADMIN_QUERY);
		ResultSet resSet = UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().executeQuery();
		while (resSet.next()) {
			if (resSet.getString("ad_userName").equals(userName) && resSet.getString("ad_pwd").equals(password)) {
				flagVal = true;
				break;
			}
		}
		return flagVal;
	}
	
}