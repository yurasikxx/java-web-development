package com.epam.jwd.model;

import java.util.Objects;

public class SomePojo {

	private final String name;
	private final int number;
	private final boolean flag;
	
	public SomePojo(String name, int number, boolean flag) {
		this.name = name;
		this.number = number;
		this.flag = flag;
	}

	public String getName () {
		return name;
	}

	public int getNumber () {
		return number;
	}

	public boolean isFlag () {
		return flag;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SomePojo somePojo = (SomePojo) o;
		return number == somePojo.number && flag == somePojo.flag && Objects.equals(name, somePojo.name);
	}	

	@Override
	public int hashCode() {
		return Objects.hash(name, number, flag);
	}	

	@Override
	public String toString() {
		return "SomePojo{" +
			"name='" + name + '\'' + 
			", number=" + number +
			", flag=" + flag +
			'}';
	}

}
