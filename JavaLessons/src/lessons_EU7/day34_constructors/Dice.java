package lessons_EU7.day34_constructors;

import java.util.Random;

public class Dice {
	
	int sides;
	int value;
	
	public Dice(int numSides) { // constructor  initialize values!
		sides=numSides; // sides is initialized by numSides(coming from DiceTest in main method)
		roll();			// value is initialized by roll() method.
	}
	
	public void roll() {
		Random rand= new Random();
		value= rand.nextInt(sides)+1;
	}
	
	public int getSides() {
		return sides;
	}
	
	public int getValue() {
		return value; // we can use roll() also.but our aim is: initialized values that given in field.
	}
	
	
	
	
	
}
