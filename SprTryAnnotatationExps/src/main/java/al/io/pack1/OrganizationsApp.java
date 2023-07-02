package al.io.pack1;

public class OrganizationsApp {
	
	private int orgId;
	private String orgName;
	private long empCount;
	
	public OrganizationsApp(int orgId, String orgName, long empCount) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.empCount = empCount;
	}

	@Override
	public String toString() {
		return "OrganizationsApp [orgId=" + orgId + ", orgName=" + orgName + ", empCount=" + empCount + "]";
	}
	
	public int getOrgId() {
		return orgId;
	}
	
	public String getOrgName() {
		return orgName;
	}
	
	public long getEmpCount() {
		return empCount;
	}
	
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public void setEmpCount(long empCount) {
		this.empCount = empCount;
	}
	
}