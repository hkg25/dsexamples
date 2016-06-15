package com.java8.pallav;

public class Dish {

	private String id;
	private String name;
	private double calories;
	
	
	public Dish(String id, String name, double calories) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + "]";
	}
	
	
	
}
