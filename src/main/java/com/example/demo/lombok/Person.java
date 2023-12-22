package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor   //디폴트 생성자
@AllArgsConstructor  //모든 생성자 초기화
public class Person {
	
	String name;
	
	int age;

	
	

}
