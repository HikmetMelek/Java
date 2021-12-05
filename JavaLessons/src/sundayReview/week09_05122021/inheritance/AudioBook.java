package lessons_EU7.sundayReview.week09_05122021.inheritance;

public class AudioBook extends Book {
	
	int length;
	String narrator;
	
	public void listen() {
		System.out.println("Listening Audiobook");
		System.out.println("--------------------");
		System.out.println("Title of book : "+ title);
		System.out.println("Author is: "+ author);
		System.out.println("Price : "+ price);
		System.out.println("Narrator is : "+ narrator);
		System.out.println("Length of book : "+ length+" hours");
		
	}
	

}
