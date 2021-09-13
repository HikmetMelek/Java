package lessons_EU7.day5_unary_assignment_relational_Operators;

public class TypeCasting {

		public static void main(String[] args) {
			
		int i=81;
		byte b;
		double d=323.142;
		float f=72.38f;
		char c='A';
		
		c=(char) i;
		System.out.println("i="+ i+" c= "+ c);  // because in unicode 81: Q
		
		i=(int) d;
		System.out.println("d="+ d+" i="+ i);
		
		i=(int) f;
		System.out.println("f="+ f+" i="+ i);
		
		b=(byte) d;
		System.out.println("d="+ d+"     b="+ b);//byte very smaller againts double, we lost data (byte--->double)
		
			
			
			
			
		}
}
