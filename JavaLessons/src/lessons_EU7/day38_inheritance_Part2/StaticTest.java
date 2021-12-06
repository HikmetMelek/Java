package lessons_EU7.day38_inheritance_Part2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj= new StaticSub();
		
		obj.num=5;
		obj.print();
		
		StaticSuper.num=10;
		obj.print();
		System.out.println(StaticSub.num);
		
		//StaticSub.m2(); --> gives me error. m2 not static
		StaticSub.m1();
		obj.m2();
		obj.m1();
		

	}

}
