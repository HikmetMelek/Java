package replit.statements;

import java.util.Scanner;

public class LaptopConfigurator {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
	    double price=0;
	    int ram, memory;
	    double size;
	    String cpu, storage, screen;
	    
	    System.out.println("Select screen size:");
	    size=scan.nextDouble();
	    if(size==13.3)  	    price=price+200;
	    else if (size==15.0)  	price=price+300;
	    else if (size==17.3)  	price=price+400;	
	    
	    System.out.println("Select CPU type:");
	    cpu=scan.next();
	    if (cpu.equals("i3")) price=price+150;
	    else if (cpu.equals("i5")) price=price+250;
	    else if (cpu.equals("i7")) price=price+350;
	    
	    System.out.println("Select RAM size:");
	    ram=scan.nextInt();
	    price=price+(ram/4)*50;
	    	
	    System.out.println("Select storage type:");
	    storage=scan.next();
	    System.out.println("Enter memory size:");
	    memory=scan.nextInt();
	    if (storage.equals("HDD")) price= price+(memory/500)*50;
	    else if(storage.equals("SSD")) price= price+(memory/500)*100;
	    
	    System.out.println("Enter screen resolution:");
	    screen= scan.next();
	    if (screen.equals("FULLHD")) price=price+100;
	    else if (screen.equals("4K")) price=price+200;
	    
	    
	    System.out.println("Laptop price is: $"+price);
	    

	}

}
