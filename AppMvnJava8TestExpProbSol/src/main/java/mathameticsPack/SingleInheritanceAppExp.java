package mathameticsPack;

class ParentSuperCls
{
    private Object myInsObjectref;
	
    public String getMyInsObjectref() {
		return String.valueOf(myInsObjectref);
	}

	public ParentSuperCls(Object objData) {
		this.myInsObjectref=objData;
	}

	public void printAnyObjectValue()
	{
	System.out.println("\nHey!! i am from Base class : "+getMyInsObjectref());
	}
}

public class SingleInheritanceAppExp extends ParentSuperCls {
	
	public SingleInheritanceAppExp(Object objData) {
		super(objData);
	}

	public static void main(String[] args) {
		new ParentSuperCls("-wwkej.3274874874").printAnyObjectValue();
	}
}
