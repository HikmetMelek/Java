package replit.statements;

import java.util.Scanner;

public class GiftCard {

	public static void main(String[] args) {
		String Blanket, Charger, Hat, Headphones,Laptop,Pants,Pillow,Smartphone,Socks,USBcable;
		int giftCard=100;
		String item;
		int blanket=60;
		int charger=25;
		int hat=25;
		int headphones=30;
		int laptop=200;
		int pants=50;
		int pillow=40;
		int smartphone=1000;
		int socks=5;
		int usbcable=10;		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter the product you want to buy:");
		item=sc.next();
		
		
		switch(item) {
		case "Blanket": 
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-blanket)+"$");
			break;
		case"Charger": 		
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-charger)+"$");
			break;
		case"Hat": 		
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-hat)+"$");
			break;
		case"Headphones": 		
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-headphones)+"$");
			break;
		case"Pants": 		
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-pants)+"$");
			break;
		case"Socks": 		
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-socks)+"$");
			break;
		case"USBcable":	
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-usbcable)+"$");
			break;
		case"Pillow":	
			System.out.println("Thank you for your purchase!");
			System.out.println("Your current balance is: "+(giftCard-pillow)+"$");
			break;	
		case"Smartphone":case"Laptop":
			System.out.println("Sorry, not enough funds on your gift card!");
			break;
		default:
			System.out.println("Invalid item!");
		}
							
	}

}
//Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. 
//- If item is not in the list, display message: _**"Invalid item!"**_. 
//- If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_ 
//
//> **_List of items_**
//> Blanket - 60$
//> Charger - 25$
//> Hat - 25$
//> Headphones - 30$
//> Laptop - 200$
//> Pants - 50$
//> Pillow - 40$
//> Smartphone - 1000$
//> Socks - 5$
//> USB cable - 10$
//
//Hint: if/ else if / else or switch statement 
//
//Examples: 
//
//```
//input: Hat
//output: 
//Thank you for your purchase!
//Your current balance is: 75$
//```
//
//```
//input: Pants
//output: 
//Thank you for your purchase!
//Your current balance is: 50$
//```
//
//
//```
//input: Laptop
//Output:
//Sorry, not enough funds on your gift card!
//```
//
//```
//input: Cupcake
//output: Invalid item!
//```