package com.guvi.Java8BeginnMod;
import java.lang.reflect.Method;

class RuntimeAnnotationDriverClassExp {
	
	public RuntimeAnnotationDriverClassExp()
	{
		System.out.println("\nAnnotation in Java represents Meta Informations");
		System.out.println("\nJava have 2 types of Annotations : - i) Runtime and ii) CompileTime");
	}
	
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("@Override --> is Complie Time Annotation");
		return super.equals(obj);
	}
	
	@ExpRunTimeMyCustAnnota(pi=3.412,appName="SDET-QAAuto")
	public void startUpSetMyAnnMeth()
	{
		System.out.println("\nAdding my custome Annotation Here on top of startUpSetMyAnnMeth()");
	}
	
	
	public static void main(String[] args) {
		System.out.println("\nExecution Starting Point-->");
		Class clsObjRef;
		try {
			clsObjRef = Class.forName("test.guviJava8BeginnMod.RuntimeAnnotationDriverClassExp");
			Method methArr[]=clsObjRef.getDeclaredMethods();
			System.out.println("\nGoing to work with 'RunTime Annotation' --> @Retention(RetentionPolicy.RUNTIME)");
			for(Method met:methArr)
			{
				System.out.println(met);
				if(met.getName().indexOf("startUpSetMyAnnMeth")!=-1)
				{
					ExpRunTimeMyCustAnnota objRefAnno=met.getAnnotation(ExpRunTimeMyCustAnnota.class);
					System.out.println(objRefAnno.appName());
					System.out.println(objRefAnno.pi());
					
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}