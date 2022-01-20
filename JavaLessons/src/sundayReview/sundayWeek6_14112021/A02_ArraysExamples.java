package sundayReview.sundayWeek6_14112021;

public class A02_ArraysExamples {

	public static void main(String[] args) {
		
		//create an int array which has html status code of:
		// 200,201,204,400,401,403,404, and 500
		
		int[] statusCodes= {200,201,204,400,401,403,404,500};
		
		System.out.println(statusCodes.length);
		
		String[] responseTypes= {"OK", "Created","No Content", "Bad Request", "Inauthorized",
				 "Forbidden", "Not Found","Internal Server Error"};
		
		// loop to each element of this arrays you have two options:
		// for loop  or  [for each loop (advantages: easier syntax, no need to deal with index; 
									//but disadvantage: you can not make your loop go backward)]
		for (int i=0; i< statusCodes.length; i++) {
			System.out.println(statusCodes[i]+ " Status Code : "+ responseTypes[i]);
		}
		
		System.out.println("-----------------------------");
		int j=0;
		for (String reponse: responseTypes) {
			System.out.println(statusCodes[j]+ " Status Code : "+reponse);
			j++;
			
		}
				
		
		
		
		
		
		
	}

}
