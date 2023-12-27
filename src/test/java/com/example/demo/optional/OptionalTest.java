package com.example.demo.optional;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalTest {

	@Test
	void Optional사용하기() {

		// optional은 객체를 감싸는 wraapper 클래스이다
		// 객체에 값이 있는지 없는지를 확인하기
		Optional<String> opt = Optional.of("apple");

		System.out.println(opt.get()); // 값 꺼내기
		System.out.println(opt.isEmpty()); // 값이 없는지 확인
		System.out.println(opt.isPresent()); // 값이 있는지 확인
		System.out.println(opt.orElse("banana")); // 값이 없으면 바나나로 대체(있으면 출력)
	}

	@Test
	void of와ofNullable의차이() {
		String str = null;

//		Optional<String> opt1 = Optional.of(str);   
		Optional<String> opt2 = Optional.ofNullable(str); // ofNullable을 쓰면 실행 가능
		System.out.println(opt2); // empty 주소만 가지고 있음.
	}

	@Test
	void 빈객체를사용하는경우() {

		Optional<String> opt = Optional.ofNullable(null);
//		System.out.println(opt.get()); // 에러남 겟메소드는 오류남, 주소는 가지고 있음.
	}

	@Test
	void optional을사용하여null값체크하기() {

		String str = "banana";

		Optional<String> opt = Optional.ofNullable(null);

		opt.ifPresent(name -> System.out.println(name + "값이 존재합니다")); // ifPresent 함수는 값이 있을 때만 출력 가능 널값이면 실행은 되지만 아무것도
																		// 안 나온다
	}

	@Test
	void if를사용하여null값체크() {

		String str = "banana";

		if (str != null) {
			System.out.println("값이 존재합니다");
		}
	}
}
