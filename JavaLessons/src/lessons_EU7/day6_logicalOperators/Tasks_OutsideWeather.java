package lessons_EU7.day6_logicalOperators;

public class Tasks_OutsideWeather {

	public static void main(String[] args) {
		
		String outsideWeather;
		int degree;
		outsideWeather="Shinny";
		degree=70;
		boolean comp2= (! (outsideWeather=="Rainy" || degree==70));
		// ( ! (F || T))= !T => F
		System.out.println(comp2);
		System.out.println("========================");
		
		int b=2;
		boolean res= ++b ==2 || --b == 2 && --b == 2;
		// 3=2 || 2=2 && 1=2
		// F || T && F =>  F || F => F
		
		System.out.println(res);
		System.out.println("============================");
		
		boolean x= true, z= true;
		int y =20;
		x= (y!=10)|| (z=false);// be careful => z=false is different from z== false ....
		// T ||-----=T
		System.out.println(x);
		
		System.out.println("============================");
		
		double d1= 20.0;
		double d2= 80.0;
		double d3= ++d1 + ++ d2 + 25;
		
		double sum= d3 / 40;
		boolean sum2= sum <= 20;
		System.out.println("sum2=" +sum2);
		

	}

}
