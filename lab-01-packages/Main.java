import cat.Cat;
import person.Person;

public class Main {
	
	public static void main(){
		
		init();
		
	}
	
	public static void init(){
		
		Cat cat = new Cat("Барсик");
        Person person = new Person("Аня", cat);
		
		person.personAndCat();
		
	}
	
}