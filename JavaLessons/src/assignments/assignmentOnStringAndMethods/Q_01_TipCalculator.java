package assignments.assignmentOnStringAndMethods;

import java.util.Scanner;

public class Q_01_TipCalculator {

	public static void main(String[] args) {
		
		tipCalculator();
	}

	public static void tipCalculator() {
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Split:");
	    String split = sc.next().toLowerCase();
       
	    System.out.print("Number of people:");
	    int numPeople = sc.nextInt();
    
	    System.out.print("Check amount:");
	    double amount = sc.nextDouble();
    
	    System.out.print("Service Quality:");
	    String quality = sc.next().toLowerCase();
       
       
       double totalPay,totalTip=0,totalPerPerson,tipPerPerson;

        switch(quality){

          case "poor":
              totalTip = amount*0.05;
              break;
              
          case "fair":
              totalTip = amount*0.1;
              break;
              
          case "good":
              totalTip = amount*0.15;
              break;
              
          case "great":
              totalTip = amount*0.20;
              break;
              
          case "excellent":
              totalTip = amount*0.25;
              break;  
        }
        
        totalPay = amount + totalTip;
        totalPerPerson = totalPay/numPeople;
        tipPerPerson = totalTip/numPeople;
        
        System.out.print("Number of people entered: ");	
	        for(numPeople=numPeople; numPeople>0; numPeople--) {
	        	System.out.print('&');
        	}
	        System.out.println();
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + totalTip);
          
          switch(split) {
          
          case "yes":
              System.out.println("Total per person: " + totalPerPerson);
              System.out.println("Tip per person: " + tipPerPerson);
              break;
          }	
          sc.close();
	}
}
