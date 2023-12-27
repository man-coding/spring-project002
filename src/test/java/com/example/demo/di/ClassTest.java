package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClassTest {

	@Autowired
	Class classroom;

	@Autowired
	Teacher teacher;

	@Test
	void 수업테스트() {

		System.out.println(classroom.teacher);
		System.out.println(teacher);
		System.out.println(classroom);

	}

}
