package assignments.assignmentOnOOPConsept.Q6;

public class ParkingMeter {
	
	int timeLeft=0;
	int maxTime;
	
	public ParkingMeter(int maxTime) {
		this.maxTime = maxTime;
	}
	

	public boolean add(int timeLeft) {	
		if(timeLeft==25 && (timeLeft+30)< maxTime) { 
			this.timeLeft=30;
			return true;
		}else {
			this.timeLeft=0;
			return false;
		}
		
	}
	
	public void tick() {	
		if(timeLeft>0)
			timeLeft-=1;	
	}
	
	public boolean isExpired() {
		if(timeLeft==0)
			return true;
		else return false;	
	}
	

}
