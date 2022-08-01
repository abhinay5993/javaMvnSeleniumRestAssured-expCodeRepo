package com.prog.odinsexps.week11Assign;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserContactDtoOperations {

	private int userId;
	private String userName;
	private String userEmailId;
	private String userMobileNo;
	private String userCountry;
	
	public UserContactDtoOperations() {
		super();
	}
	
	public UserContactDtoOperations(String userName, String userEmailId, String userMobileNo, String userCountry) {
		super();
		this.userName = userName;
		this.userEmailId = userEmailId;
		this.userMobileNo = userMobileNo;
		this.userCountry = userCountry;
	}

	public UserContactDtoOperations(int userId, String userName, String userEmailId, String userMobileNo,
			String userCountry) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmailId = userEmailId;
		this.userMobileNo = userMobileNo;
		this.userCountry = userCountry;
	}

	public int getUserId() {
		return this.userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getUserEmailId() {
		return this.userEmailId;
	}

	public String getUserMobileNo() {
		return this.userMobileNo;
	}

	public String getUserCountry() {
		return this.userCountry;
	}


	//Insert Contact logic
	public boolean insertNewUsersDetails(UserContactDtoOperations userDtoObj) throws ClassNotFoundException, SQLException {
		boolean blnFlagStatus;
		UserContactDbManagerDAo.getInstanceOfDBManager().setPrepStatement(UserContactDbManagerDAo.INSERT_USERCONTACT_QUERY);

		// SettingUp the plance holder values
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setInt(1, userDtoObj.getUserId());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(2, userDtoObj.getUserName());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(3, userDtoObj.getUserEmailId());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(4, userDtoObj.getUserMobileNo());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(5, userDtoObj.getUserCountry());

		int insStatus = UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().executeUpdate();
		blnFlagStatus = (insStatus != 0 && getUserName() != null && getUserName().length() != 0
				&& getUserEmailId() != null && getUserEmailId().length() != 0 && getUserMobileNo() != null
				&& getUserMobileNo().length() != 0 && getUserCountry() != null && getUserCountry().length() != 0);
		
		return blnFlagStatus;
	}
	
	
	// Select User details by userId
	public UserContactDtoOperations getUserContactById(int userId) throws ClassNotFoundException, SQLException {
		UserContactDtoOperations userDtoObj = null;
		UserContactDbManagerDAo.getInstanceOfDBManager().setPrepStatement(UserContactDbManagerDAo.SELECT_USERCONTACT_BYUSERID);
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setInt(1, userId);

		ResultSet resSet = UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().executeQuery();
		while (resSet.next()) {
			String userName = resSet.getString("user_Name");
			String uEmail = resSet.getString("user_EmailId");
			String uMobNo = resSet.getString("user_MobileNo");
			String uCountry = resSet.getString("user_Country");
			userDtoObj = new UserContactDtoOperations(userId, userName, uEmail, uMobNo, uCountry);
		}
		return userDtoObj;
	}
	
	
	// get list of all user contacts
	public List<UserContactDtoOperations> getAllUserContacts() throws ClassNotFoundException, SQLException {
		List<UserContactDtoOperations> userDtoObj = new ArrayList<>();
		UserContactDbManagerDAo.getInstanceOfDBManager().setPrepStatement(UserContactDbManagerDAo.SELECT_USERCONTACT_QUERY);
		// write DB Code for result set
		ResultSet resSet = UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().executeQuery();
		while (resSet.next()) {
			int userId = resSet.getInt("user_Id");
			String userName = resSet.getString("user_Name");
			String uEmail = resSet.getString("user_EmailId");
			String uMobNo = resSet.getString("user_MobileNo");
			String uCountry = resSet.getString("user_Country");
			userDtoObj.add(new UserContactDtoOperations(userId, userName, uEmail, uMobNo, uCountry));
		}
		return userDtoObj;
	}
	
	
	//Update User Contact logic
	public boolean updateUsersContacts(UserContactDtoOperations userDtoObj) throws ClassNotFoundException, SQLException {
		boolean blnStatusFlag;
		UserContactDbManagerDAo.getInstanceOfDBManager().setPrepStatement(UserContactDbManagerDAo.UPDATE_USERCONTACT_QUERY);

		// SettingUp the plance holder values
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(1, userDtoObj.getUserName());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(2, userDtoObj.getUserEmailId());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(3, userDtoObj.getUserMobileNo());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setString(4, userDtoObj.getUserCountry());
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setInt(5,userDtoObj.getUserId());

		int updateStatus = UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().executeUpdate();
		blnStatusFlag = (updateStatus != 0 && getUserName() != null && getUserName().length() != 0
				&& getUserEmailId() != null && getUserEmailId().length() != 0 && getUserMobileNo() != null
				&& getUserMobileNo().length() != 0 && getUserCountry() != null && getUserCountry().length() != 0);
		
		return blnStatusFlag;
	}
	
	
	// Delete User Contact by userId
	public boolean deleteContactByUserId(int userId) throws ClassNotFoundException, SQLException {
		boolean blnFlagStatus;
		UserContactDbManagerDAo.getInstanceOfDBManager().setPrepStatement(UserContactDbManagerDAo.DEL_USERCONTACT_QUERY);

		// SettingUp the plance holder values
		UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().setInt(1, userId);
		int delStatus = UserContactDbManagerDAo.getInstanceOfDBManager().getPrepStatement().executeUpdate();
		blnFlagStatus = (delStatus != 0);
		return blnFlagStatus;
	}
	
	
}