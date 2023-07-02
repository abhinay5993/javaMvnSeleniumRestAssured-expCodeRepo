package sport.playerapp.pojomodel;

public class NumberChecker {

	private Long numberData;
	private Boolean isEvenFlag=false;
	private Boolean isOddFlag=false;
	
	
	public Long getNumberData() {
		return numberData;
	}
	public Boolean isEvenFlag() {
		return isEvenFlag=(getNumberData()%2==0)?true:false;
	}
	
	public Boolean isOddFlag() {
		return isOddFlag=(getNumberData()%2!=0)?true:false;
	}
	
	public void setNumberData(Long numberData) {
		this.numberData = numberData;
	}
	public void setEvenFlag(Boolean isEvenFlag) {
		this.isEvenFlag = isEvenFlag;
	}
	public void setOddFlag(Boolean isOddFlag) {
		this.isOddFlag = isOddFlag;
	}
	
}