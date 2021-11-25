package lessons_EU7.day34_constructors;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES=6;
		
		Dice sixDice= new Dice(SIX_SIDES); 
		rollDice(sixDice);
		
		//rollDice(new Dice(SIX_SIDES));    ==    Dice sixDice= new Dice(SIX_SIDES); rollDice(sixDice);
		
	}
	
	public static void rollDice(Dice d) {
		// rolling a 6 sides dice
		System.out.println("Rolling a "+ d.getSides()+ " sided dice ");
		
		// The dice's value: 5
		System.out.println("Dice's value : "+ d.getValue());
	}

}





















