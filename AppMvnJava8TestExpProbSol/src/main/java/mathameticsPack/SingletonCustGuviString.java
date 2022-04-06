package mathameticsPack;

public class SingletonCustGuviString {
	
	private static SingletonCustGuviString strInstanceObj;
	private static String textData;
	
	private SingletonCustGuviString() {

	}
	
	public String getTextData() {
		return textData;
	}
	
	public static void setTextData(String textData) {
		SingletonCustGuviString.textData = textData;
	}

	public static SingletonCustGuviString getStrInstanceObj(String text) {
		if (strInstanceObj == null || textData==null) {
			strInstanceObj = new SingletonCustGuviString();
			setTextData(text);
		}
		return strInstanceObj;
	}


	public void printMyStringDataToConsole()
	{
		System.out.println("\nData Val : "+getTextData());
	}
	
	public static void main(String[] args) {
		SingletonCustGuviString singleObj=SingletonCustGuviString.getStrInstanceObj("Guvi Team");
		singleObj.printMyStringDataToConsole();
	}
}
