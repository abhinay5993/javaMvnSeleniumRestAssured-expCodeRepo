package mathameticsPack;

public class GuviAssign11UpcastDownCast {
	public static void main(String[] args) {
		double dob=-3493.00945;
		System.out.println("\nCurrent Premitive base Value : "+dob);
		System.out.println("====== assign the same data to No-Premitive type Number ===== --> auto-Boxing (upCasting / Genralization / Widdening ) --> ");
		Number numData=dob;
		System.out.println("\nOriginal value of No-Premitive type : "+numData);
		
		System.out.println("\n====== assign the No-Premitive type : "+numData+" to Premitive type float ===== --> auto-UnBoxing (Down-Casting / Specialization / Narrowing )--> ");
		float fltVal=numData.floatValue();
		System.out.println("\nDown-Casting Assignment of float val : "+fltVal);
		
		System.out.println("\n====== assign Premitive type : "+dob+" to Premitive type int ===== --> (Down-Casting / Specialization / Narrowing )--> ");
		int xIntVal=(int) dob;
		System.out.println("\nDown-Casting Assignment of int val : "+xIntVal);
	}
}