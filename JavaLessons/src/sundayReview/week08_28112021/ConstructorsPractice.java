package lessons_EU7.sundayReview.week08_28112021;

public class ConstructorsPractice {
	
	
	public ConstructorsPractice() {
		System.out.print("a  ");
	}
	
	public ConstructorsPractice(int num) {  // call no arg cons. from here
		this();
		System.out.print("b  ");
	}
	
	public ConstructorsPractice(String str) {
		this(10);
		System.out.print("c  ");
	}
	
	public static void main(String[] args) { // let debug!
		System.out.println("hello");
		new ConstructorsPractice("hello");
		
	}
	
}
