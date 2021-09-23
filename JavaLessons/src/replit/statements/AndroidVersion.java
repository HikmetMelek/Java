package replit.statements;

import java.util.Scanner;

public class AndroidVersion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    double version = input.nextDouble();	
		
		if(version==1.5) System.out.println("Cupcake");
		else if (version==1.6) System.out.println("Donut");
		else if (version==2.1) System.out.println("Eclair");
		else if (version==2.2) System.out.println("Froyo");
		else if (version==2.3) System.out.println("Gingerbread");
		else if (version==3.1) System.out.println("Honeycomb");
		else if (version==9.0) System.out.println("Pie");
		else System.out.println("Sorry, I don't know this version!");
		
		
	}	
	

}
//Android is one of the best operating systems in the world that helps the billion of users who use smart phones and tablets. Also, Android versions always had some funny names related to sweets. In this assignment, you need to write a program that will print a name of Android version, based on number. Please refer to the link beneath, in order to develop your if statement.
//https://www.javatpoint.com/android-versions
//
//1. Create an object of **_Scanner_** class named **_scanner. (DONE)_**
//2. Create **_double_** variable named **_version._ (DONE)**
//3. Write an if statement that will print android version name based on value of the **_version_** variable.
//
//> `Versions`
//> 1.5 - Cupcake
//> 1.6 - Donut
//> 2.1 - Eclair
//> 2.2 - Froyo
//> 2.3 - Gingerbread
//> 3.1 - Honeycomb
//> 4.0 - Ice Cream Sandwich
//> 4.1 - Jelly Bean
//> 4.4 - KitKat
//> 5.0 - Lollipop
//> 8.0 - Oreo
//> 9.0 - Pie
//
//
//Example:
//```
//
//input: 1.5
//output: Cupcake
//```
//```
//input: 9.0
//output: Pie
//```
//
//```
//input: 11.0 
//output: Sorry, I don't know this version!


