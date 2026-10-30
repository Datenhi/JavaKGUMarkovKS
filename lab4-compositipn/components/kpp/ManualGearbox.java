package components.kpp;

public class ManualGearbox extends AbstractGearbox {

	public ManualGearbox(int maxGear) {
		
		super(maxGear);
		
	}
	
	@Override
	public String getGearName() {
        if (currentGear == 0) {
            return "нейтраль";
        }
        return currentGear + "-ю передачу";
    }
	
}