package com.h2dbconnect.jpaRestserve.coursesService;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Courses> getAllCourses() {
		return Arrays.asList(
				new Courses(1, "JavaSE", "TestDev"), 
				new Courses(2, "AWS", "CaartLane"),
				new Courses(3, "Selenium", "Automation")
				);
	}
}