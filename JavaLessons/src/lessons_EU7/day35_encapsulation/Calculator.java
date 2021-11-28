package lessons_EU7.day35_encapsulation;
/*
Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor
and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor
with a carpet. // cost*area
 */
public class Calculator {
	//calling another Class: Composition;
	// double cost; same thing with Floor floor 
	
	Floor area; // floor can be area;
	Carpet cost; // carpet can be area;
	
	
	public Calculator(Floor floor, Carpet carpet) { // passing object to method parameters
		this.area = floor;
		this.cost = carpet;
	}



	public double getTotalCost() {
		return cost.getCost() * area.getArea();
	}
	
	
}
