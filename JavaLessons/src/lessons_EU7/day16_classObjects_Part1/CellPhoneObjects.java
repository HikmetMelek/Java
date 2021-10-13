package lessons_EU7.day16_classObjects_Part1;

public class CellPhoneObjects {

	public static void main(String[] args) {
		
		CellPhone phone1= new CellPhone();
		
		phone1.brand="Apple";
		phone1.color="white";
		phone1.price=5300;
		phone1.screenSize=2.0;
		
		phone1.call();
		System.out.println(phone1.color);
		System.out.println(phone1.price);
		System.out.println(phone1.screenSize);
		
		System.out.println(phone1.color);
		phone1.color="Silver";
		System.out.println(phone1.color);
		
		
		CellPhone phone2= new CellPhone();
		
		phone2.brand="Samsung";
		phone2.color="black";
		phone2.price=54.5;
		System.out.println("Brand :"+ phone2.brand);
		System.out.println("Price :"+ phone2.price);
		 
		phone2.message();
		
	}

}
