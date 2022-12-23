package com.h2dbconnect.jpaRestserve.empService;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDetailsCont {
	
	@RequestMapping("/getEmpList")
	public List<Employees> getAllEmployees() {
		return Arrays.asList(
				new Employees(101,"Ramesh","Ramesh@gmail.com","Hydrabad",120000,"20-12-2021"), 
				new Employees(102,"Suresh","Suresh@gmail.com","Delhi",120000,"21-12-2021"), 
				new Employees(103,"Ganesh","Ganesh@gmail.com","Banglore",120000,"22-12-2021"), 
				new Employees(104,"Mahesh","Mahesh@gmail.com","Chennai",120000,"23-12-2021"), 
				new Employees(105,"Yateesh","Yateesh@gmail.com","Mumbai",120000,"24-12-2021"), 
				new Employees(106,"Paneesh","Paneesh@gmail.com","Kolkata",120000,"25-12-2021"), 
				new Employees(107,"Gneesh","Gneesh@gmail.com","Paris",120000,"26-12-2021"), 
				new Employees(108,"Vignesh","Vignesh@gmail.com","London",120000,"27-12-2021")
				);
	}

}


