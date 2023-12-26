package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//스프링 환경 만들기
@SpringBootTest
public class PersonTest {

	@Test // 단위테스트
	void test() {

		Person person1 = new Person(); // 디폴트 생성자

		person1.setName("둘리"); // setter
		person1.setAge(12);

		System.out.println(person1.getName()); // getter
		System.out.println(person1.getAge());
		
		Person person2 = new Person("또치",15); //모든 멤버변수 초기화
		System.out.println(person2); //재정의             
		
		Person person3 = Person
							.builder()
							.name("도우너").age(17)   //정확하게 내가 어떤 내용을 넣어야 하는지 알 수 있음, 빌더패턴이 더 편하다
							.build();    //위에 생성자오 결과값 같음 , 활용도 높음.   위 생성자 단점: 필요한 정보만 골라서 넣을 수 없음
		
		System.out.println(person3.toString());
		System.out.println(person3.toString());
	}

}
