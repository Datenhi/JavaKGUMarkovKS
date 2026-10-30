import components.motor.Motor;
import components.motor.PetrolMotor;
import components.motor.ElectricMotor;
import components.kpp.Gearbox;
import components.kpp.ManualGearbox;
import components.kpp.AutomaticGearbox;
import car.Car; 

public class Main{
	
	private static final String MODEL_ONE = "Лада Веста";
	private static final String MODEL_TWO = "Tesla Model 3";
	private static final int POWER_ONE = 106;
	private static final int POWER_TWO = 283;
	private static final int GEAR_INIT = 5;
	private static final int GEAR = 3;
	private static final int FALED_GEAR = 1;
	

	public static void main(String[] args){

		init();	

	}

	public static void init(){
	
		Car car1 = new Car(MODEL_ONE, new PetrolMotor(POWER_ONE), new ManualGearbox(GEAR_INIT));
      Car car2 = new Car(MODEL_TWO, new ElectricMotor(POWER_TWO), new AutomaticGearbox());
		
		car1.start();
		car1.gearUp(GEAR);
		car1.drive();
		car1.gearDown(GEAR);
		car1.stop();
		car2.gearUp(FALED_GEAR);
		car2.start();
		car2.drive();
		car2.gearUp(GEAR);
		car2.drive();
		car2.stop();
		

	}

}