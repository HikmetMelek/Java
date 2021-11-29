package lessons_EU7.day36_staticClassMembers;

public class CountableTest {

	public static void main(String[] args) {
		
		int objectCount;
		Countable obj1= new Countable();
		Countable obj2= new Countable();
		Countable obj3= new Countable();
		// changing becoming in class variable. in static variable
		/*
		objectCount= obj1.getInstanceCount();
		objectCount= obj2.getInstanceCount();
		System.out.println(objectCount);
		*/
		System.out.println(Countable.instanceCount);
		
	}

}
