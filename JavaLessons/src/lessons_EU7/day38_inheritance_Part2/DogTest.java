package lessons_EU7.day38_inheritance_Part2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog= new Dog("Yorkie", 1, 1, 8, 20, 2, 4, 1, 20, "Long Sily");
		
		dog.chew();
		System.out.println("---------------");
		
		dog.eat();
		System.out.println("---------------");
		
		System.out.println(dog.getName());
		System.out.println("---------------");
		
		System.out.println(dog.getWeight());
		System.out.println("---------------");
		
		dog.move(10);
		
		
		
		

	}

}
