package mathameticsPack;

public class GuviArithmeticExp {
	long num1;
	long num2;
	double numX;
	double numY;

	public GuviArithmeticExp(long num1, long num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public GuviArithmeticExp(double num1, double num2) {
		this.numX = num1;
		this.numY = num2;
	}

	public void doubleSumVal()
	{
		System.out.println("\nSum : "+(numX+numY));
	}
	
	public void intProductVal()
	{
		System.out.println("\nInt Product : "+num1*num2);
	}
	
	public static void main(String[] args) {
		GuviArithmeticExp longObj=new GuviArithmeticExp(48,239);
		GuviArithmeticExp doubleObj=new GuviArithmeticExp(9.334,-3.44344);
		longObj.intProductVal();
		doubleObj.doubleSumVal();
	}
}