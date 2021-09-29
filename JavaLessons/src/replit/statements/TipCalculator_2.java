package replit.statements;

import java.util.Scanner;

public class TipCalculator_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Split:");
        String split = sc.next();
           
        System.out.println("Number of people:");
        int numPeople = sc.nextInt();
        
        System.out.println("Check amount:");
        double amount = sc.nextDouble();
        
        System.out.println("Service Quality:");
        String quality = sc.next();
           
           
           double totalPay,totalTip=0,totalPerPerson,tipPerPerson;

            switch(quality){

              case "Poor":
                  totalTip = amount*0.05;
                  break;
                  
              case "Fair":
                  totalTip = amount*0.1;
                  break;
                  
                  
              case "Good":
                  totalTip = amount*0.15;
                  break;
                  
              case "Great":
                  totalTip = amount*0.20;
                  break;
                  
              case "Excellent":
                  totalTip = amount*0.25;
                  break;
              
            }
            
            totalPay = amount + totalTip;
            totalPerPerson = totalPay/numPeople;
            tipPerPerson = totalTip/numPeople;
            
            System.out.print("Number of people entered: ");
            
            while(numPeople>0) {
                  numPeople--;
                  System.out.print("&");
              }
            System.out.println();
              
            System.out.println("Total to pay: " + totalPay);
            System.out.println("Total tip: " + totalTip);
              
              switch(split) {
              
              case "Yes":
                  System.out.println("Total per person: " + totalPerPerson);
                  System.out.println("Tip per person: " + tipPerPerson);
                  break;
              }


	}

}
