package lessons_EU7.day39_inheritance_review;

public class Toyota extends Car {

	private int roadServise;

	public Toyota(int roadServise) {
		super("Toyota", "4WD", 4, 4, 6, false);
		this.roadServise = roadServise;
	}
	
	public void accelerate(int rate) {
		int newVelocity= getCurrentVelocity()+ rate;
		
		if(newVelocity == 0) {
			stop(); // calling from Vehicle class
			changeGear(1);
		}else if(newVelocity>0 && newVelocity<=10) {
			changeGear(1);
		}else if(newVelocity>10 && newVelocity<=20) {
			changeGear(2);
		}else if(newVelocity>20 && newVelocity<=30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		if(newVelocity>0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
	}
	
	
	
	
	
	
	
	
	

}
