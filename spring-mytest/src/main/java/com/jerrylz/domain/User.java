package com.jerrylz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jerrylz
 * @date 2020/8/7
 */
public class User {
	private String name;
	private int age;

	public User(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
