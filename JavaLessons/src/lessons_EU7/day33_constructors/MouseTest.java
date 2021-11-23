package lessons_EU7.day33_constructors;

public class MouseTest {

	public static void main(String[] args) {
	
		//print and see output
		Mouse mouse= new Mouse(15);
		mouse.print();
		
		System.out.println("------------");
		
		Mouse mouse1= new Mouse(20, 14);
		mouse1.print();
		
		System.out.println("------------");
		
		Mouse mouse2= new Mouse(5, 4, 6);
		mouse2.print();
		
		

	}

}
