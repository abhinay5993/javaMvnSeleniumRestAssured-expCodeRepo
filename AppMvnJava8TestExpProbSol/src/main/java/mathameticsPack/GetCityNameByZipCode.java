package mathameticsPack;

public enum GetCityNameByZipCode {

	BIRBHUM(731204, "BOLPUR"), KOLKATA(700102, "KESTOPUR"), CHENNAI(600007, "PURSAIWAKKAM"),BANGALORE(500007, "WHITE FIELD");

	GetCityNameByZipCode(int i, String cityVal) {
		this.pinCode = i;
		this.cityName = cityVal;
	}

	private int pinCode;
	private String cityName;

	public int getPinCode() {
		return pinCode;
	}

	public String getCityName() {
		return cityName;
	}
	
	public String getCityByPinCodeValue(int pin)
	{
		return cityName=(pin==this.getPinCode())?this.getCityName():"PIN Code and City!! not avaiable";
	}
	
	public boolean isThePinCodeExits(int pin)
	{
		return (pin==this.getPinCode())?true:false;
	}
	
	
}