package sundayReview.sundayWeek4_17102021;

public class Art {

	public static void main(String[] args) {
		draw();
		draw("red");
		draw(5);
		
		System.out.println(draw("yellow",8));

	}


		public static void draw() {
			System.out.println("Basic drawing");
		}
		
		public static void draw(String color) {
			System.out.println("Drawing with "+color);
		}
		
		public static void draw(int size) {
			System.out.println("-------------------");
			draw("blue");
			System.out.println("Drawing with size "+size);
		}
		
		public static String draw(String color, int size) {
			String result = "Drawing with "+color+" and size "+size;
			return result;
		}
		
}
