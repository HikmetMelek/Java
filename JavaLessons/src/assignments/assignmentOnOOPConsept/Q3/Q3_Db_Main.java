package assignments.assignmentOnOOPConsept.Q3;

public class Q3_Db_Main {

	public static void main(String[] args) {
		
		Db db = new Db();
		db.insertData("aaa",123);

		System.out.println(db.getData());//aaa
		System.out.println(db.getYint());//123

		db.setData("zzz");
		db.setYint(200);

		System.out.println(db.getData());//zzz
		System.out.println(db.getYint());//200

	}

}
