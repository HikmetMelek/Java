package replit.methods;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String d,d1,d2;
//		String s1= "java1try2one";
//		char c1= 'y';
//		String s2="1";
//		char s3;
//		s3= s2.charAt(0);
//		System.out.println(s3);
//		System.out.println(s1.indexOf(s3));
//		if (s1.contains(c1+"")) System.out.println("havali");
//		d= s1.substring(0, s1.indexOf(s3));
//		System.out.println(d);
//		d1= s1.substring(s1.indexOf(s3), s1.indexOf("2"));
//		System.out.println(d1);
//		s1= s1.replace(s1.substring(s1.indexOf(s3), s1.indexOf("2")), "");
//		System.out.println(s1);
		
		System.out.println("--------------------------------");
		String str= "aaappccccz";
		String result = "";
	    int counter=1;

	        for(int i=0 ; i<str.length()-1 ; i++){
	        	if(str.charAt(i) == str.charAt(i+1)){
	                counter++;
	            }else{
	                result += counter +""+ str.charAt(i);
	                counter=1;
	            }
	        }
	        if(str.charAt(str.length()-2) == str.charAt(str.length()-1)){
	            result += counter +""+ str.charAt(str.length()-1);
	        }
	        else{
	            result += "1" + str.charAt(str.length()-1);
	        }
	        System.out.println(result);
	}

}
