package mathameticsPack;

public class GuviUtilsClass_Persons {
	
	private String panNo;
	private String name;
	private String mobileNo;
	
	public String getPanNo() {
		return panNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	public void setPanNo(String panNo) {
		if (panNo.length() == 10 && isPANAlphanumeric(panNo)) {
			this.panNo = panNo;
		} else {
			this.panNo = "Invalid!!! PAN..";
		}
	}
	
	public boolean isPANAlphanumeric(String pan) {
		boolean flagVal = false;
		for (int i = 0; i < pan.length(); i++) {
			if (Character.isLetterOrDigit(pan.charAt(i))) {
				flagVal = true;
			}
		}
		return flagVal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMobileNo(String mobileNo) {
		if (mobileNo.length() == 10) {
			this.mobileNo = mobileNo;
		} else {
			this.mobileNo = "Invalid!!! Mobile No..";
		}
	}

	public void getPersonDetails()
	{
	System.out.println("\n==========================");	
	System.out.print("\nPAN No    : "+getPanNo());	
	System.out.print("\nName      : "+getName());	
	System.out.print("\nMobile No : "+getMobileNo());
	}
}