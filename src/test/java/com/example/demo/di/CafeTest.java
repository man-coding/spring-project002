package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CafeTest {

	@Autowired
	Cafe cafe;

	@Autowired
	Manager manager;

	@Test
	void 카페주소확인() {
		System.out.println(cafe.manager);
		System.out.println(manager);
	}
}
