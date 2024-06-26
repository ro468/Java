package com.webbertech.java;

import java.util.Optional;

public class OptionalFilterExample {

	public OptionalFilterExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();

		// Filter on Optional
		System.out.println(gender.filter(g -> g.equals("male"))); // Optional.empty
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE"))); // Optional[MALE]
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("MALE"))); // Optional.empty

	}
}
