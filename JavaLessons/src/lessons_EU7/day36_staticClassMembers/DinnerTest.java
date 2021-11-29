package lessons_EU7.day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom= new Dinner(); // they have total only 8 slices pizza
		Dinner kid= new Dinner(); //if u did not use 'static' in instance value in dinner class; every objects would have 8 slices.
		Dinner dad= new Dinner();
		
		System.out.println("Total slices: "+ Dinner.pizzaSlice);

		dad.takeASlice();//7
		kid.takeASlice();//6
		mom.takeASlice();//5
		System.out.println(Dinner.pizzaSlice);
		
		kid.takeASlice(2);//5-2
		dad.takeASlice(3);//3-3
		System.out.println(Dinner.pizzaSlice);
		
		
	}

}
