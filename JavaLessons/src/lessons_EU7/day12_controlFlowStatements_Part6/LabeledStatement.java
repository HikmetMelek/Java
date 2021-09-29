package lessons_EU7.day12_controlFlowStatements_Part6;

public class LabeledStatement {

	public static void main(String[] args) {
		// you can use any name for label;  label: ==> outer:  , inner: etc..
		int i=0;
		outer: // label
			do {
				i=8;
				inner: //label
					while(true) {
						System.out.println(i--);
						if(i==4) {
							break outer;
						}
					}
			}while(true);
	}

}
