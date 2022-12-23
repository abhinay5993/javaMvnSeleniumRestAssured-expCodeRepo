package com.h2dbconnect.jpaRestserve;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class JpaDbExpTestSprAppApplication {

	public static void main(String[] args) {
		System.out.println("\nBefore Run() --> Test...");
		SpringApplication.run(JpaDbExpTestSprAppApplication.class, args);
		System.out.println("\nAfter Run() --> JPA+Db connect Test...");
	}

}