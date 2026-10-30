package car;

import components.motor.Motor;
import components.kpp.Gearbox;

public class Car {
	
	private boolean isStarted = false;

	private final String model;
	private Motor motor;
	private Gearbox gearbox;

	public Car(String model, Motor motor, Gearbox gearbox){

		this.model = model;
		this.motor = motor;
		this.gearbox = gearbox;

	}

	public void setMotor(Motor motor){

		this.motor = motor;

	}

	public void setGearbox(Gearbox gearbox){

		this.gearbox = gearbox;

	}

	public void start() {

		motor.start();
		isStarted = true;
	
	}	
	
	public void stop() {
		if (gearbox.getCurrentGear() == 0){
			motor.stop();
			isStarted = false;
		} else {
            System.out.println(model + ": Сначала снизьте передачу до 0!");
        }
	}
	
	public void gearUp(int times) {
	
		if ( ensureStarted() || times <=0 ) return;
		for (int i = 0; i < times; i++) gearbox.shiftUp();
	
	}
	
	public void gearDown(int times) {
	
		if ( ensureStarted() || times <=0 ) return;
		for (int i = 0; i < times; i++) gearbox.shiftDown();
	
	}
	
	public void drive(){

		if ( isStarted && gearbox.getCurrentGear() >=2) {
			
			motor.accelerate();
			
		} else {
			
			System.out.println(model + ": Нужно больше оборотов!");			
			
		}

	}
	
	private boolean ensureStarted() {
		
        if (!isStarted) {
			
            System.out.println(model + ": Сначала заведите мотор!");
            return true;
			
        }
		
        return false;
		
    }

}
