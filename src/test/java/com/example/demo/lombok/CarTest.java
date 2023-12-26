package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTest {

	@Test
	void test() {

		Car car1 = new Car();
		car1.setModel("santafe");
		car1.setCompany("hyundae");
		car1.setColor("blue");
		System.out.println(car1.getModel() + " " + car1.getCompany() + " " + car1.getColor());

		Car car2 = new Car("santafe", "hyundae", "blue");
		System.out.println(car2.toString());

		Car car3 = Car.builder().model("santafe").company("hyundae").color("blue").build();
		// 카빌더 객체를 생성하여 정보를 모두 입력하고 마지막으로 Car라는 객체를 생성해 주면 완료
		System.out.println(car3);
	}
}
