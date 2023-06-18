package clr.apps.qa;
import com.github.javafaker.Faker;

public class ClientsQABuilds {
	
	private String productName;
	private String buildVer;
	Faker fackObj;
	
	@Override
	public String toString() {
		return "ClientsQABuilds [productName=" + getProductName() + ", buildVer=" + getBuildVer() + "]";
	}

	public String getProductName() {
		return getFackObj().app().name();
	}
	
	public String getBuildVer() {
		return getFackObj().app().version();
	}
	
	public Faker getFackObj() {
		return new Faker();
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setBuildVer(String buildVer) {
		this.buildVer = buildVer;
	}
	
	public void setFackObj(Faker fackObj) {
		this.fackObj = fackObj;
	}

}