package mathameticsPack;

public class ZipCodeEnumGuivExampleWithClass {
	public static void main(String[] args) {
		GetCityNameByZipCode dataEnum[] = GetCityNameByZipCode.values();
		int testPinCode=600007;
		for (GetCityNameByZipCode data : dataEnum) {
			if(data.isThePinCodeExits(testPinCode))
			{
			System.out.println("\nThe required value of City : " + data.getCityByPinCodeValue(testPinCode));
			break;
			}
			System.out.println("\nPinCode Not Found!!..");
		}
	}
}