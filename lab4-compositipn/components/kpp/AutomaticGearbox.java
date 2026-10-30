package components.kpp;

public class AutomaticGearbox extends AbstractGearbox {

	private static final String[] MODES = {"P", "R", "N", "D"};
	
	public AutomaticGearbox() {
		
        super(MODES.length - 1);
		
    }
	
	@Override
    public String getGearName() {
		
        return "режим " + MODES[currentGear];
		
    }

}