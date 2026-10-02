package animals;

interface Sound {
	
    void makeSound();
	
}

public abstract class Animal implements Sound {
	
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		
        this.name = name;
        this.age = age;
		
    }
	
	public abstract String getFood();
	
	public void info() {
		
        System.out.println(this.getName() + ", возраст: " + age + " лет, еда: " + this.getFood());
		
    }

    String getName() {
		
        return this.name;
		
    }
	
}