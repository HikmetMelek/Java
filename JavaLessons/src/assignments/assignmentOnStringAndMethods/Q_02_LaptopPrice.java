package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_02_LaptopPrice {

	public static void main(String[] args) {
		
		laptopPrice();

	}
	public static void laptopPrice() {
		
		Scanner scan=new Scanner (System.in);
		double price=0;
		int ram, memory;
		double size;
		String cpu, storage, screen;
	    
		System.out.print("Select screen size:");
		size=scan.nextDouble();
		if(size==13.3)  	    price=price+200;
		else if (size==15.0)  	price=price+300;
		else if (size==17.3)  	price=price+400;	
	    
	    System.out.print("Select CPU type:");
	    cpu=scan.next().toLowerCase();
	    if (cpu.equals("i3")) price=price+150;
	    else if (cpu.equals("i5")) price=price+250;
	    else if (cpu.equals("i7")) price=price+350;
	    
	    System.out.print("Select RAM size:");
	    ram=scan.nextInt();
	    price=price+(ram/4)*50;
	    	
	    System.out.print("Select storage type:");
	    storage=scan.next().toUpperCase();
	    System.out.print("Enter memory size:");
	    memory=scan.nextInt();
	    if (storage.equals("HDD")) price= price+(memory/500)*50;
	    else if(storage.equals("SSD")) price= price+(memory/500)*100;
	    
	    System.out.print("Enter screen resolution:");
	    screen= scan.next().toUpperCase();
	    if (screen.equals("FULLHD")) price=price+100;
	    else if (screen.equals("4K")) price=price+200;
	    
	    
	    System.out.println("Laptop price is: $"+price);
  

	}
}
