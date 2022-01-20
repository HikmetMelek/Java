package sundayReview.week09_05122021.inheritance.sundayWeek7_21112021;

public class Products {
		
		String name;
		double price;
		
		public void setInfo(String n, double d) {
			name=n;
			price=d;
			
		}

		@Override
		public String toString() {
			return "Products [name= " + name + ", price= " + price + "]";
		}

	


}
