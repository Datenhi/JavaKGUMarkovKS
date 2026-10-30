package components.motor;

public class PetrolMotor extends AbstractMotor{
	
	private static final String MOTOR_NAME = "Бензиновый мотор";

	public PetrolMotor(double power) {
		  
        super(MOTOR_NAME, power);
		
    }

    @Override
    protected double initialStep(double maxSpeed) {
		
        return 1.0;
		
    }

    @Override
    protected double nextStep(double currentStep) {
		
        return currentStep + 1;
		
    }

}