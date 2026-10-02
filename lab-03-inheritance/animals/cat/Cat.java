package animals.cat;

import animals.Animal;

public class Cat extends Animal {
	
	public Cat(String name, int age) {
		
		super(name, age);
		
	}
	
	@Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }
	
	@Override
	public String getFood() {
		
		return "рыба";
		
	}
	
}