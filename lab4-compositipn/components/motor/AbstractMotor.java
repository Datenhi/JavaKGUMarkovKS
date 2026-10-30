package components.motor;

public abstract class AbstractMotor implements Motor{

    private static final double AIR_DENSITY = 1.225;
    private static final double DRAG_COEFFICIENT = 0.3;
    private static final double FRONTAL_AREA = 2.2;
    private static final double HP_TO_WATTS = 746.0;
    private static final double MS_TO_KMH = 3.6;

	 private final String name;
    private final double power;

    protected AbstractMotor(String name, double power) {
		
		  this.name = name;        
        this.power = power;
		
    }

    public double getPower() {
		
        return power;
		
    }

	@Override
    public void start() {
		
        System.out.println(name + " завёлся");
		
    }

	@Override
    public void stop() {
		
        System.out.println(name + " остановился");
		
    }
	
	protected double calculateMaxSpeed() {
		
        double vMetersPerSec = (power * HP_TO_WATTS) / (0.5 * AIR_DENSITY * DRAG_COEFFICIENT * FRONTAL_AREA);
        return Math.round(Math.cbrt(vMetersPerSec) * MS_TO_KMH);
		
    }
	
	 protected abstract double initialStep(double maxSpeed);

    protected abstract double nextStep(double currentStep);

	@Override
    public void accelerate() {
		
        double maxSpeed = calculateMaxSpeed();
        double speed = 0;
        double step = initialStep(maxSpeed);

        while (speed < maxSpeed) {
			
            speed = Math.min(speed + step, maxSpeed);
            System.out.printf("Текущая скорость: %.0f км/ч%n", speed);
            step = nextStep(step);
			
        }
		
    }

}