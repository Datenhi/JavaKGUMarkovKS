import coffee.Coffee;

public class Main{
	
	public static void main(String[] args){
		
		init();		
			
	}	
	
	public static void init(){

		for (Coffee coffee : Coffee.values()){
			
			System.out.println(coffee.ordinal() + " " + coffee.name());
		
		}
			
		
		Coffee latte = Coffee.valueOf("LATTE");
		System.out.println(latte.name());
		System.out.println(latte.ordinal());
		System.out.println(latte.getVolume());
		System.out.println(latte.getPrice());
					
		
		for (Coffee coffee : Coffee.values()){
			
			coffee.getFullInfo();
		
		}		
		
	}
	
}