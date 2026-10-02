package animals.dog;

import animals.Animal;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		
		super(name, age);
		
	}
	
	@Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав-гав!");
    }
	
	@Override
	public String getFood() {
		
		return "кость";
		
	}
	
}