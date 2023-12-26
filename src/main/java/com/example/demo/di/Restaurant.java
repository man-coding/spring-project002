package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

	Chef chef1 = new Chef();

	@Autowired
	Chef chef2; // 싱글톤 패턴
}
