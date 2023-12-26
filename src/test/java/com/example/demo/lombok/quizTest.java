package com.example.demo.lombok;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class quizTest {

	@Test
	void test() {

		Student student1 = new Student();
		student1.setStudentId(1001);
		student1.setName("또치");
		student1.setAge(20);
		System.out.println(student1.getStudentId());
		System.out.println(student1.getName());
		System.out.println(student1.getAge());

		Student student2 = new Student(1001, "또치", 20);
		System.out.println(student2.toString());

		Student student3 = Student.builder().studentId(1001).age(20).name("또치").build();
		System.out.println(student3.toString());
	}

	@Test
	void 영화생성테스트() {
		Movie movie = Movie.builder().title("기생충").director("봉준호").releaseDate(LocalDate.of(2023, 11, 22)).build();
		System.out.println(movie);

		Movie movie2 = new Movie("333", "ddd", null);
		System.out.println(movie2);
	}

}
