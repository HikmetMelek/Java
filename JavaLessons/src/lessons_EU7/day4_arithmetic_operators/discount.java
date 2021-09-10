package lessons_EU7.day4_arithmetic_operators;


 // this program calculates the sale price of an 
 // item that is regular priced at $59, with a 20% discount on it.


public class discount {

	public static void main(String[] args) {
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount= regularPrice*0.2;
		salesPrice= regularPrice - discount;
		 
		System.out.println("Regular Price: $"+ regularPrice);
		System.out.println("Discount Amount: $"+ discount);
		System.out.println("Sale Price: $"+ salesPrice);
		
		
		
		
		
		
		
		

	}

}
