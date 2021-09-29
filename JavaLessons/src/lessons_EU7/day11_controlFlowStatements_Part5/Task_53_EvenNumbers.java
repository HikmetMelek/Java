package lessons_EU7.day11_controlFlowStatements_Part5;

public class Task_53_EvenNumbers {

	public static void main(String[] args) {
		// sum even numbers
		
		int num=0;
		int sum=0;
		while (num<100) {
			
			if (num%2==0) {
				sum=sum+num;
				num++;
			}else num++;
			
		}
		
		System.out.println(sum);
// Ozzy' solution:
//		while (num<100) {  
//			
//			if (num%2==0) {
//				sum=sum+num;
//			}
//			num++;
//			
//		}
//		
//		System.out.println(sum);
		
	}

}
