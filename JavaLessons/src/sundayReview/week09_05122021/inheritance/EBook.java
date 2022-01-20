package sundayReview.week09_05122021.inheritance;

public class EBook extends Book {

	int size; //MB
	int pages;
	String format; // mobi,epub...
	
	public void readBook() {
		System.out.println("Reaging Book");
		System.out.println("Title of book : "+ title);
		System.out.println("Author is: "+ author);
		System.out.println("Size : "+ size);
		System.out.println("Pages : "+ pages);
		
	}
	
	
	
	
	
}
