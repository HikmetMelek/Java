package lessons_EU7.sundayReview.week09_05122021.inheritance;

public class Test_BookObjects {

	public static void main(String[] args) {
		
		AudioBook audioBook= new AudioBook();
		audioBook.title="Becoming";
		audioBook.author="Michael Obama";
		audioBook.price= 11.75;
		audioBook.narrator= "Random House Audio";
		audioBook.length=15;
		audioBook.listen();
		
		System.out.println("************************");
		
		EBook ebook= new EBook();
		ebook.author="Yahya Kemal";
		ebook.title="Kendi Gokkubbemiz Altinda";
		ebook.pages= 215;
		ebook.readBook();
		
		
		
		

	}

}
