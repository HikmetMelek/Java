package replit.methods;

import java.util.*;

public class MethodWithString_LameDb {

	 public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
	     
	 }
	 
	 public static String lameDb(String db, String op, String id, String data) {
		 String change="";
		 char bulId= id.charAt(0);
		 String[] arr= db.split("#");
		 
		 if(op.equalsIgnoreCase("add") && !db.contains(id)) { // add new data at the end of list
			String[] arrAdd= new String[arr.length+1];
			for(int i=0; i< arr.length; i++) {
				arrAdd[i]=arr[i];
			}
			arrAdd[arr.length]= id+data; // add new data
			change=arrAdd[0];
			for(int j=1; j< arr.length+1; j++) {
				change+= "#"+arrAdd[j];
			}
			return change;
			
		 }
		 else if(db.contains(id)) {
			 switch(op) {
				case "edit":
					change=db.substring(0, db.indexOf(bulId)) +id+ data + db.substring(db.indexOf(bulId)+(data.length()+1));
					return change;	
				
				case "delete":
					if(id.equals("1")) {
						change+=arr[1];
						for(int i=2; i<arr.length; i++) {
							change+="#"+arr[i];	
						}
					}else {
						change+=arr[0];
						for(int i=1; i< arr.length; i++) {
							if(!arr[i].contains(id)) {
								change+="#"+arr[i];
							}
						}
						
					}
					return change;
					
				case "add":
					String[] arrAdd2= new String[arr.length+1];
					if(id.equals("1")) {
						for(int i=0; i<arr.length; i++) {
							if(arr[i].contains(id)) {
								arrAdd2[i]=id+data;
								change+=arrAdd2[i];
							}
							arrAdd2[i+1]=arr[i].replace(""+arr[i].charAt(0), ""+(Integer.valueOf(id)+i+1));
							change+="#"+arrAdd2[i+1];
						}
					}else {
						arrAdd2[0]=arr[0];
						change+=arrAdd2[0];
						for(int i=1; i<arr.length; i++) {
							if(arr[i].contains(id)) {
								arrAdd2[i]=id+data;
								change+="#"+arrAdd2[i];
							}
							arrAdd2[i+1]=arr[i].replace(""+arr[i].charAt(0), ""+(Integer.valueOf(id)+i));
							change+="#"+arrAdd2[i+1];
						}
					}
					return change;
						
			 }
		 	 
		 }
	 
		return "try";
	 
	 
	 } 
	 
	 
}
