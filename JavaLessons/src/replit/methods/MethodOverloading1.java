package replit.methods;

import java.util.*;

public class MethodOverloading1 {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }

    }

    public static int findMax(int[] num){
      int number= Integer.MIN_VALUE;
      for(int each: num) {
          if (number < each)
              number = each;
      }
        return number;
    }

    public static double findMax(double[] num){
        double number= Double.MIN_VALUE;
        for(double each: num) {
            if (number < each)
                number = each;
        }
        return number;
    }



}
