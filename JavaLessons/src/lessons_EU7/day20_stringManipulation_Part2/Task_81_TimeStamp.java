package lessons_EU7.day20_stringManipulation_Part2;

public class Task_81_TimeStamp {

	public static void main(String[] args) {
		
		String date = "10/10/2019 14:59:00";
		System.out.println(timeStamp(date));

	}
	
	public static String timeStamp(String str) {
		
		return str= str.replace("/", "").replace(" ", "").replace(":", "");
		
	}

}
