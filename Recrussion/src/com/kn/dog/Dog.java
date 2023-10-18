package com.kn.dog;

public class Dog {
	private String name ;
	private String colour ;
	private int age;
	private String breed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Dog(String name, String colour, int age, String breed) {
		this.name = name;
		this.colour = colour;
		this.age = age;
		this.breed = breed;
	}
	
	

}
