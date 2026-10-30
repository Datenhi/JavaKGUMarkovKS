package components.kpp;

public abstract class AbstractGearbox implements Gearbox {

	 protected int currentGear = 0;
    protected final int maxGear;
	
	protected AbstractGearbox(int maxGear) {
		
        this.maxGear = maxGear;
		
    }
	
	@Override
	public void shiftUp() {
        if (currentGear >= maxGear) {
            System.out.println("Выше передач нет");
            return;
        }
        currentGear++;
        System.out.println("Водитель включил " + getGearName());
    }
	
	@Override
	public void shiftDown() {
        if (currentGear <= 0) {
            System.out.println("Ниже передач нет");
            return;
        }
        currentGear--;
        System.out.println("Водитель включил " + getGearName());
    }
    
	 @Override    
    public int getCurrentGear(){

		return currentGear;    
    
    }
	
	public void printStatus() {
        System.out.println("Текущая передача: " + getGearName());
    }

}