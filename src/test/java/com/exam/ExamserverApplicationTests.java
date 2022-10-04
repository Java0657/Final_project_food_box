package com.exam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.food_delivery.ExamserverApplication;

@SpringBootTest(classes=ExamserverApplication.class)
class ExamserverApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("testing main");
	}

}
