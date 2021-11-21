package replit.arrays;

import java.util.Arrays;

public class Array2D_Chessboard {

	public static void main(String[] args) {
		
		String[][] chessBoard = new String[8][8];
		
	
		for (int i=0; i< chessBoard.length; i++) {
			char c='a';
			for(int j= 0; j<8; j++) {
		
				chessBoard[i][j]= (i+1)+""+c;
				System.out.print(chessBoard[i][j]);
				System.out.print(" ");
				c++;
				
			}
			System.out.println();
		}
		//System.out.println(Arrays.deepToString(chessBoard));
		
		
		

	}

}
