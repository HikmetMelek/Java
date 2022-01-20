package sundayReview.sundayWeek4_17102021;

public class ScrumTeam {

	String companyName;
	int developers;
	int testers;
	double developerSalary;
	double testersSalary;
	double companyRevenue;
	
	public double costOfTheTeam() {
		return developers*developerSalary+ testers*testersSalary;
	}
	
	public double returnOfInvestment() {
		return companyRevenue/costOfTheTeam();
				
	}
	public void createCompany(String name, int devNums, int tesNums) {  // setter method
		companyName = name;
		developers = devNums;
		testers = tesNums;
	}

//	@Override
//	public String toString() {
//		return "ScrumTeam [companyName=" + companyName + ", developers=" + developers + ", testers=" + testers
//				+ ", developerSalary=" + developerSalary + ", testersSalary=" + testersSalary + ", companyRevenue="
//				+ companyRevenue + "]";
//	}
//	
}
