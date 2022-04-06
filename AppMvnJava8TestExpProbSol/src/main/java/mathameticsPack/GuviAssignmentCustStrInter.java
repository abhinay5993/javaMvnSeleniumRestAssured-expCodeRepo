package mathameticsPack;

interface AssignmentCustStrInter {
	String interFaceMeber = "Greet from Hello!! Interface";

	void getMemberVal(String str);

	default void getLabdaMeth(String str) {
		System.out.println("\nHey !! this from Interface.."+str);
	}
}

public class GuviAssignmentCustStrInter implements AssignmentCustStrInter
{
	private Object objVal;
	
	public GuviAssignmentCustStrInter(Object objArg)
	{
	setObjVal(objArg);
	}
	
	public void setObjVal(Object objVal) {
		this.objVal = objVal;
	}
	
	public String getObjVal() {
		return String.valueOf(objVal);
	}

	@Override
	public void getMemberVal(String str) {
		System.out.println("\nGet data Member val from : " + interFaceMeber);
		getLabdaMeth(str);
	}
	

	public static void main(String[] args) {
		GuviAssignmentCustStrInter obj=new GuviAssignmentCustStrInter("9990jdhfjdhf.kxfkjfj");
		obj.getMemberVal(obj.getObjVal());
		System.out.println(obj.getObjVal());
	}

}