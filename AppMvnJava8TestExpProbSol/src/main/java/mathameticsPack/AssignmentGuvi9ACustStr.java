package mathameticsPack;

class Guvi9ACustStr {
	
	public String getStingValue(int data)
	{
	 return String.valueOf(data);
	}
}

public class AssignmentGuvi9ACustStr extends Guvi9ACustStr
{
	private int inpTestData;
	private String insFlagMsgData;
	
	public AssignmentGuvi9ACustStr(String data) {
		try {
			if (data!= null || data.length()==0) {
				this.inpTestData = Integer.parseInt(data);
			}
		} catch (Exception e) {
			this.insFlagMsgData="Not Initialized";
		}
	}

	public int getInpTestData() {
		return inpTestData;
	}
	
	public void printData() {
		if (this.inpTestData == 0) {
			System.out.println(this.insFlagMsgData);
		} else {
			System.out.println(getStingValue(getInpTestData()));
		}
	}
	
	public static void main(String[] args) {
		AssignmentGuvi9ACustStr childObj=new AssignmentGuvi9ACustStr("459495");
		childObj.printData();
	}
	
}