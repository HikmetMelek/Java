package replit.methods;

import java.util.Scanner;

public class String_LameDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
	}
	  public static String lameDb(String db, String op, String id, String data) {
		String change="";
		String change1="";
		String change2="";
		char bulId= id.charAt(0);
		
		if(db.contains(id)){
			
			switch(op) {
			case "edit":
				change=db.substring(0, db.indexOf(bulId)) +id+ data + db.substring(db.indexOf(bulId)+(data.length()+1));
				break;	
			
			case "delete":
				change= db.replace(db.substring(db.indexOf(bulId), db.indexOf("#")+1), "");
				break;
			
			case "add":
				change1= id+data+"#";
				for (int i=1; i<db.length()-1;i++) {
					
					change2+= db.replace("i","i+1");
					
				}
				change= change1+ change2;
				break;
			}
		
		
		}else {
			if (op.equals("add"))
				change= db+"#"+id+data;
		}
		  
		  
		 return change; 
		  
		
	  }
}
