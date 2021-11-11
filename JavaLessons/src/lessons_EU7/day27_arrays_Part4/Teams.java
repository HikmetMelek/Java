package lessons_EU7.day27_arrays_Part4;

public class Teams {

	public static void main(String[] args) {
		
		//String[][] teams = new String[2][4];
		/*
			teams[0][0] = "Mike";
			teams[0][1] = "Tonny";
			teams[0][2] = "Smith";
			teams[0][3] = "Evan";
				
			teams[1][0] = "David";
			teams[1][1] = "Emmy";
			teams[1][2] = "John";
			teams[1][3] = "Ryan";
		*/
		
		String[][] teams= { {"mike", "tonny","smith","evan"} , {"David","Emmy","John","Ryan"} }; //2 row, 4 column
		
		System.out.println("First player of first team is  "+ teams[0][0]);
		System.out.println("number of rows: "+ teams.length); // array.length= row
		System.out.println("# People in first team: " + teams[0].length);
		System.out.println("# People in second team: " + teams[1].length); // array[0].length= column

	}

}
