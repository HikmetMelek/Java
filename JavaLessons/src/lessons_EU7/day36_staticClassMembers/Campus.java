package lessons_EU7.day36_staticClassMembers;

public class Campus {
	
	private String city;
	static String country;
	
	static { // static block run firstly, first of all 
		System.out.println("Static Block-1");
		country="USA";
	}
	
	public Campus(String city) {
		System.out.println("Constructor");
		//this.setCity(city);
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}

//	public void setCity(String city) {
//		this.city = city;
//	}

	static {
		System.out.println("Static Block-2");
		country="UK";
	}

	

}
