package lessons_EU7.sundayReview.week08_28112021;

public class Item {
	
	String name;
	double unitPrize;
	int quantity;
	
	public Item(String name, double unitPrize, int quantity) {
		this.name = name;
		this.unitPrize = unitPrize;
		this.quantity = quantity;
	}

	public String toString() {
		return "Item [name=" + name + ", unitPrize=" + unitPrize + ", quantity=" + quantity + "]";
	}
	
	public double calCost() {
		return unitPrize*quantity;
	}

}
