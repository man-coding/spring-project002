package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookTest {

	@Test
	void test() {

		Book book1 = new Book(); // 생성자들은 어떤 멤버변수를 넣어야 할지 잘 모름.
		book1.setCompany("ms");

		Book book2 = new Book("클린코드", 30000, "애자일소프트웨어", 400);

		Book book3 = Book.builder().title("알고리즘").price(20000).build(); // 멤버변수 바로 알 수 있음.

		System.out.println(book1.getCompany() + book1.getPrice());
		System.out.println(book2.toString());
		System.out.println(book3.toString());

	}
}
