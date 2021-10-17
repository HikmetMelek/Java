package lessons_EU7.sundayReview.sundayWeek4_17102021;

public class Salary {

	double rate;
	double taxRate;
	int weeklyHour;	
	
	public void setInfo(double r, double t, int w){
	    rate = r;
	    taxRate = t;
	    weeklyHour = w;
	    
	}
	
	public double salary() {   // instance methods
		return rate*weeklyHour*52;
	}
	 
	public double totalTax() {   // instance methods
		return salary()*taxRate;
	}
	
	public double salaryAfterTax() {
		return salary() - totalTax() ;
	}
		

	
}
