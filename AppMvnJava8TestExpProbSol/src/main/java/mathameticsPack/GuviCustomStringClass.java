package mathameticsPack;

public class GuviCustomStringClass {
	String insVar1;
	String insVar2;
	
	public GuviCustomStringClass(String s1, String s2) {
		this.insVar1 = s1;
		this.insVar2 = s2;
	}
	
	public static void checkEuqlByDoubleEqualOperator(Object obj1,Object ob2) {
		if (obj1 == ob2) {
			System.out.println("Both the refarence are equal using == operator.");
		} else {
			System.out.println("Both the refarence are NOT !! equal using == operator.");
		}
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (!(obj instanceof GuviCustomStringClass)) {
			return false;
		}

		GuviCustomStringClass custObj = (GuviCustomStringClass) obj;

		return insVar1.compareTo(custObj.insVar1) == 0 && insVar2.compareTo(custObj.insVar2) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println("\n******************* Custom String class Object Initialization *******************");
		GuviCustomStringClass testObj1=new GuviCustomStringClass("caratlane","caratlane");
		GuviCustomStringClass testObj2=new GuviCustomStringClass("caratlane","caratlane");

		GuviCustomStringClass.checkEuqlByDoubleEqualOperator(testObj1, testObj2);
		System.out.println("\nTest the object with .equals() is : "+testObj1.equals(testObj2));
		
		System.out.println("\n******************* Java String class Object Initialization *******************");
		String s1Obj=new String("caratlane");
		String s2Obj=new String("caratlane");
		
		GuviCustomStringClass.checkEuqlByDoubleEqualOperator(s1Obj, s2Obj);
		System.out.println("\nTest the object with .equals() is : "+s1Obj.equals(s2Obj));
		
	}
}
