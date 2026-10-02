import animals.Animal;
import animals.cat.Cat;
import animals.dog.Dog;

public class Main {
	
	public static void main(){
		
		init();
		
	}
	
	public static void init() {
		
		Dog rex = new Dog("Рекс", 3);
		Cat murka = new Cat("Мурка", 2);
		
		rex.makeSound();
		rex.info();
		
		murka.makeSound();
		murka.info();
		
		
	}
	
}