package sundayReview.week09_05122021.inheritance.sundayWeek7_21112021;

public class R07_Array2DMaxMinValue {

	public static void main(String[] args) {
		int [][] arr2D = { {100,-200,-300}, {-40,500}, {-100,250,-800}};
		
		// max and min questions: you need to set a check point, to compare each value against
			
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr2D.length;i++) {             // iteration for 1D array
			for(int j=0; j<arr2D[i].length;j++) {      // iteration for each element
				if(arr2D[i][j]>max) {
					max = arr2D[i][j];
				}
				if(arr2D[i][j]<min) {
					min = arr2D[i][j];
				}
			}
		}
		
		System.out.println("Max is : "+max);
		System.out.println("Min is : "+min);
			
		}

}
