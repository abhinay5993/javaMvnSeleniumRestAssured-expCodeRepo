package mathameticsPack;

final class ExpGuviFinalStringClass {

	private final String MY_DATAEMBERS = "Hey !! Ubantu User..";

	public final String getMyDataembers() {
		return MY_DATAEMBERS;
	}

}

class GuviCustStringFinalExp {
	public static void main(String[] args) {
		ExpGuviFinalStringClass fixedObj = new ExpGuviFinalStringClass();
		System.out.println("\nGet value from Protected methode : " + fixedObj.getMyDataembers());
	}
}