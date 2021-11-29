package lessons_EU7.day36_staticClassMembers;

public class Countable {
	
	 static int instanceCount;

	public Countable() {
		instanceCount++;
	}

	public int getInstanceCount() {
		return instanceCount;
	}
	

}
