package lessons_EU7.day35_encapsulation;

public class RoulettePocket {
	
	private int pocketNumber;
	
	public RoulettePocket(int pocketNumber) {
		this.pocketNumber=pocketNumber;
	}
	
	public int getPocketNumber() {
		return pocketNumber;
	}

	public void setPocketNumber(int pocketNumber) {
		if(pocketNumber<0 || pocketNumber>36) { 
			this.pocketNumber=100;
		}else	
			this.pocketNumber = pocketNumber;
	}

	
	public String getPocketColor() {
		if(pocketNumber==0)
			return "Green";
		else if(pocketNumber>=1 && pocketNumber<=10) {
			if (pocketNumber%2!=0)
				return "Red";
			else 
				return "Black";
		}
		else if(pocketNumber>=11 && pocketNumber<=18) {
			if (pocketNumber%2!=0)
				return "Black";
			else 
				return "Red";
		}
		else if(pocketNumber>=19 && pocketNumber<=28) {
			if (pocketNumber%2!=0)
				return "Red";
			else 
				return "Black";
		}
		else if(pocketNumber>=29 && pocketNumber<=36) {
			if (pocketNumber%2!=0)
				return "Black";
			else 
				return "Red";
		}	
		else return "Invalid";
				
	}

	
	
}
