package replit.methods;

public class test {

	public static void main(String[] args) {

		double[] arr={2.2,6.41,7.81,6.1,1.5};
		double number= Double.MIN_VALUE;
		for(double each: arr) {
			if (number < each)
				number = each;
		}
		System.out.println(number);
	}
}
