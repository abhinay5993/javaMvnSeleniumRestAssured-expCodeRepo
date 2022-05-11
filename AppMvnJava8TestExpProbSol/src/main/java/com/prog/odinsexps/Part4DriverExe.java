package com.prog.odinsexps;

public class Part4DriverExe {
    public static void main(String[] args) {
    	
    	//Test with User object and with its Interface inplimentation
    	IUser userRefObj=new UserImpl(3);
    	
    	User user1=new User("abhinay","luna","alunawat","pass1");
    	User user2=new User("kk","Aslam","kkLive","app123");
    	
    	System.out.println("\nProcess Registration : "+userRefObj.isNewRegistration(user1, 0));
    	System.out.println("\nProcess Registration : "+userRefObj.isNewRegistration(user2, 1));
    	
    	System.out.println("\nValidate Login Status : "+userRefObj.isLoginSuccess("kkLive","app123"));
    	
    	//Test with WorkOut object and with its Interface inplimentation
    	IWorkOut workRefObj=new WorkOutImpl(2);
    	
    	WorkOut work1=new WorkOut("buble-1","rmau", "spae", 32, 34);
    	WorkOut work2=new WorkOut("buble-2", "dff", "fdf", 3, 5);
    	WorkOut work3=new WorkOut("buble-3", "smmsfm", "SMG", 5, 20);
		
    	workRefObj.addWorkout(work1, 0);
    	workRefObj.addWorkout(work2, 1);
    	
    	for(WorkOut workTemp:workRefObj.displayMyWorkouts())
    	{
    		System.out.println("Object Value : "+workTemp);
    	}
	}
}
