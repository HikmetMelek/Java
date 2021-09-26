package replit.statements;

import java.util.Scanner;

public class VideoGameCoupon {

	public static void main(String[] args) {
		// The video games machines at your local arcade outputs coupons according to how well you play the game. 
		  //- You can redeem 10 coupons for a candy bar or you can redeem 3 for a gumball
		  //- Write a program that displays how many candy bars and gumballs you can get. You perfer candy bars. 

		 // - if you the coupons are not enough for any redeem, display message:

		int candy=10;
		int gumball=3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int coupon=sc.nextInt();
		int remain= coupon-candy;
		
		if (coupon>=candy && remain<gumball) {
			candy=coupon/candy;
			System.out.println("Number of Candies: "+candy);
		}else if (coupon>=candy && remain>=gumball) {
			candy=coupon/candy;
			gumball=coupon%10/gumball;
			System.out.println("Number of Candies: "+candy);
			System.out.println("Number of Gumballs: "+gumball);
			
		}else if (coupon>=gumball && coupon<candy) {
			coupon=coupon/gumball;
			System.out.println("Number of Gumballs: "+coupon);
		}else System.out.println("Not enough coupons");
		
		
		
		
		   
	}

}
//Input: 
//Enter number of coupons:
//23
//
//Output: Number of Candies: 2
//Output: Number of Gumballs: 1
//```
//
//
//```
//Input: 
//Enter number of coupons:
//2
//
//Output: Not enough coupons
//```