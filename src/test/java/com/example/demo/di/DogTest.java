package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DogTest {

	@Autowired
	Dog dog;

//	@Autowired
//	Animal animal;

	@Test
	void 강아지의기능테스트() {
		dog.sound();
	}

//	@Test
//	void 동물의기능테스트() {
//		animal.sound();
//	}
}
