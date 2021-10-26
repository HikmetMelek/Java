package lessons_EU7.day20_stringManipulation_Part2;

public class String_IndexOf {

	public static void main(String[] args) {
	
		String word1="github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		String url="www.okta.com";
		int i=url.indexOf(".");
		System.out.println("post of . "+ i);
		
		System.out.println(url.charAt(i+2));
		System.out.println("---------------------------------");
		
		// find position of "-" and check if space on right and left side
		String title= "Java - Google Search";
		int dash= title.indexOf("-");
		System.out.println(title.charAt(dash-1));
		System.out.println(title.charAt(dash+1));
		System.out.println("space top of this line");
		System.out.println(title.contains(" "));
		System.out.println("---------------------------------");
		
		String country= "United States of America";
		int states= country.indexOf("States");
		System.out.println("position of states: "+ states);
		System.out.println("---------------------------------");
		
		String word2= "java, c++, python, tomcat, eclipse";
		// check if c++ in the word2.
		boolean bool= word2.contains("c++");
		System.out.println(bool);
		
		//1)contains()
			if(word2.contains("c++")) {
				System.out.println("c++ is there");
			}else {
				System.out.println("c++ is not there");
			}
			
		//2)indexOf()
			if(word2.indexOf("c++") > -1) {
				System.out.println("c++ is there");
			}else {
				System.out.println("c++ is not there");
			}
							
		

	}

}
