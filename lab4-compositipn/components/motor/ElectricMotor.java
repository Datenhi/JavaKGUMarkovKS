package components.motor;

public class ElectricMotor extends AbstractMotor{
	
	private static final int ACCELERATION_STEPS = 10;
   private static final double MIN_STEP = 1.0;
   
   private static final String MOTOR_NAME = "Электрический мотор";

	public ElectricMotor(double power) {
		
        super(MOTOR_NAME ,power);
		
    }


    @Override
    protected double initialStep(double maxSpeed) {
		
        return maxSpeed / ACCELERATION_STEPS;
		
    }

    @Override
    protected double nextStep(double currentStep) {
		
        return Math.max(currentStep - 1, MIN_STEP);
		
    }

}