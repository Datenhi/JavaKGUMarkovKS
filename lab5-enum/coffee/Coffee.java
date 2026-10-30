package coffee;

public enum Coffee {
	
	ESPRESSO(30, 120),
	AMERICANO(150, 150),
	CAPPUCCINO(200, 220),
	LATTE(250,300);
	
	private static final int LARGE_SIZE = 200;

	private final int volume;
	private final int price;
	
	private Coffee(int volume, int price){
		
		this.volume = volume;
		this.price = price;		
		
	}
	
	public int getVolume(){
		
		return volume;	
		
	}
	
	public int getPrice(){
		
		return price;	
		
	}
	
	public void getFullInfo() {
		String size = volume >= LARGE_SIZE ? "большой" : "стандартный";
		System.out.println(name() + ": объем = " + volume + "мл(" + size + "), цена = " + price + " руб");
	
	}

}