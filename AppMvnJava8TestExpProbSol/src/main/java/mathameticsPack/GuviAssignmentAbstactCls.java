package mathameticsPack;

abstract class AssignmentAbstactClsApp {

	abstract String getTransAbsStatusMsg(String inpData);
	
}

public class GuviAssignmentAbstactCls extends AssignmentAbstactClsApp
{

	@Override
	String getTransAbsStatusMsg(String inpData) {
		System.out.println("\nI am inside child overriden methode : ");
		return inpData.toUpperCase();
	}
	
	public static void main(String[] args) {
		GuviAssignmentAbstactCls obj=new GuviAssignmentAbstactCls();
		System.out.println(obj.getTransAbsStatusMsg("caratLane.com"));
	}
}