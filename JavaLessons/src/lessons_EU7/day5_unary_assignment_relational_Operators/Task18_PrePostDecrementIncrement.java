package lessons_EU7.day5_unary_assignment_relational_Operators;

public class Task18_PrePostDecrementIncrement {
	public static void main(String[] args) {
		int x=2;
		int y= x++; // y=2; change gonna be next line, so next line x will be =3
		System.out.println(y); //post, not active in the same line so y=2(x), it active next line...>>>>
		System.out.println(x); //...>>>   x=3
		++x;
		System.out.println(x);
		System.out.println("---------------");
		int xx=2;
		int yy= xx++; // yy=2 but next line x1 will be xx+1 ; so next line xx=3
		yy=xx;
		System.out.println(yy);
		System.out.println(xx);
		System.out.println("----------------");
		
		int xX=2;
		System.out.println(xX++);
		
		int XX=2;
		System.out.println(--XX);
		
		int xc=8;
		int yc = xc--;
		System.out.println(yc);
		System.out.println(xc);
		
		
		
		
		
		}
}
