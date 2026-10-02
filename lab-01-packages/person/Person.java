package person;

import cat.Cat;

public class Person {
	
	private String name;
	private Cat cat;
	
	public Person(String name, Cat cat){
		
		this.name = name;
		this.cat = cat;
		
	}
	
	public void personAndCat(){
		
		System.out.println( "Это " + name + " и его(её) кот " + cat.getName());
		
	}
	
}