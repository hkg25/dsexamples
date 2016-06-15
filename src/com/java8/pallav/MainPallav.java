package com.java8.pallav;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainPallav {

	public static void main(String[] args) {
		List<Dish> menu = new ArrayList<>();
		menu.add(new Dish("11", "chicken", 150.2));
		menu.add(new Dish("11", "pizza", 130.2));
		menu.add(new Dish("11", "veg burger", 160.2));
		menu.add(new Dish("11", "pasta", 170.2));
		menu.add(new Dish("11", "macroni", 120.2));
		menu.add(new Dish("11", "potato", 180.2));
		
		List<Dish> heavyDish = 
				menu.stream()
				.sorted(comparing(Dish::getName))
				//.filter((Dish d) -> d.getCalories()>150.0)
				.collect(Collectors.toList());
		
		
		heavyDish.stream().forEach(x -> System.out.println(x));
		
		
	
	}
}
