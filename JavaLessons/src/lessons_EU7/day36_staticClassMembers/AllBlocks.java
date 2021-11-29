package lessons_EU7.day36_staticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("One arg cons.");
	}

	public AllBlocks() {
		System.out.println("no arg cons.");
	}
	
	static {  // static block only one time run
		System.out.println("First static init");
	}
	
	
	{  // initialization block run before cons. each time
		System.out.println("First instance init");
	}
	
	
	{
		System.out.println("Second instance init");
	}
	
	static {
		System.out.println("Second static init");
	}
	
	
	
	
	
	
}
