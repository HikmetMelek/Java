package replit.arrays;

import java.util.Arrays;

public class Arrays_3D {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE

            int[][][] values= new int[3][2][4];

            for(int a=0; a<4; a++){
                values[0][0][a]=5;
                values[0][1][a]=5;
                values[1][0][a]=7;
                values[1][1][a]=7;
                values[2][0][a]=8;
                values[2][1][a]=30+a;

            }

            //DO NOT CHANGE
            System.out.println(Arrays.deepToString(values));
        }

}
