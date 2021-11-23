package lessons_EU7.day33_constructors;

public class Mouse {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	//1. cons
	public Mouse(int weight) { // you can call ONLY one cons. in another cons.Becouse there is only one first line
		this(30,20);//this()--> has to be FIRST LINE.  You calling constructor 2 to 1 with "2's arguments"
		this.weight = weight; 
		//(30,20) u can use 'weight' instead of 20, if u do not want to change weight (30, weight)
		System.out.println("JAVA");
	}
	//2. cons
	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}
	//3.cons
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C#");
	}
	
	public void print() {
		System.out.println(weight+" "+ numTeeth+" "+ numWhiskers);
	}
	

}
