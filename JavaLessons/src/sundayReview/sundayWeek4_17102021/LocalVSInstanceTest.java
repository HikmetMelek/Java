package sundayReview.sundayWeek4_17102021;

public class LocalVSInstanceTest {

	public static void main(String[] args) {
		LocalVsInstance obj = new LocalVsInstance();

		System.out.println(" -----local variable-------");
		obj.showDifference();
		
		System.out.println("------instance variable-------");
		obj.a=10;
		System.out.println(obj.a);
		

	}

}
