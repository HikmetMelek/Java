package lessons_EU7.sundayReview.week08_28112021;

import java.util.*;

public class R01_ArrayListPractice2 {

	public static void main(String[] args) {
		
		 System.out.println(listGenerator()); 

    }

    public static ArrayList<Integer> listGenerator(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String answer="yes";
        
        while (!answer.equalsIgnoreCase("no")){
            System.out.print("Enter a number:");
            int num=s.nextInt();
            list.add(num);
            System.out.print("do you want to add new number? ");
            answer = s.next();
            
        }  
        return  list;
            
    }
}
