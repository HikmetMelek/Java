package lessons_EU7.day16_classObjects_Part1;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		//Dog dog3 = new Dog();
		
		dog1.age=10;
		dog1.color="Red";
		dog1.breed="Maltese";
		dog1.name="Tada";
		
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		System.out.println(dog1.age);
		System.out.println("---------------");
		dog1.barking();
		dog1.sleeping();
		dog1.hungry();
		
		
		
//		dog2.age=5;
//		System.out.println(dog2.age);
		
	}
	

}
