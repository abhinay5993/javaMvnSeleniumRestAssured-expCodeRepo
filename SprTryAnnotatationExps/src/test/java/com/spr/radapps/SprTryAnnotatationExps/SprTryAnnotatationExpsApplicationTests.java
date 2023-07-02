package com.spr.radapps.SprTryAnnotatationExps;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

@SpringBootTest
class SprTryAnnotatationExpsApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("\nThis is!! my TestNg Test with SpringBoot...");
	}

	@Test
	public void TestNg_Test1() {
		System.out.println("\n Test ()-1 app runs...");
	}

	@Test
	public void TestNg_Test2() {
		System.out.println("\n Test ()-2 app runs...");
	}

	@Test
	public void TestNg_Test3() {
		System.out.println("\n Test ()-3 app runs...");
	}

}