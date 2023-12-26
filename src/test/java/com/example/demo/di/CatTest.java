package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CatTest {

	@Autowired
	Cat2 cat2;

	@Test
	void 고양이기능테스트() {
		cat2.eat();
	}

}