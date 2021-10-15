package com.guvi.Java8BeginnMod;

@TestToStrData
class TestA
{
	
}

@TestToStrData
class TestX
{
	public String toStrData()
	{
		return "appTestAuto--> TestX meth";
	}
}

@TestToStrData
class TestY
{
	public String toStrData(int x)
	{
		System.out.println("\nConcept of Abstract Syntax Tree..");
		return "appTestAuto--> TestY meth : "+x+" ";
	}
}

@TestToStrData
interface myTestInterF
{
	
}
