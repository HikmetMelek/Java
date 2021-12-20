package replit.methods;

import java.util.*;

public class Tic_Tag_Toe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }

    public static String won(char[] x){
        char c1= 'X';
        char c2='O';
        char c3='-';
//        if(Character.valueOf(x[0]).equals(Character.valueOf(x[4])) && Character.valueOf(x[0]).equals(Character.valueOf(x[8]))){
//                if(Character.valueOf(x[0]).equals(c1) && !Character.valueOf(x[i]).equals(c3)) {
//                    return "Player "+c1+" won";
//                }else{
//                    return "Player "+c2+" won";
//                }
//        }else{
//            if(Character.valueOf(x[2]).equals(Character.valueOf(x[4])) && Character.valueOf(x[2]).equals(Character.valueOf(x[6]))) {
//                if (Character.valueOf(x[0]).equals(c1) && !Character.valueOf(x[i]).equals(c3)) {
//                    return "Player " + c1 + " won";
//                } else {
//                    return "Player " + c2 + " won";
//                }
//            }
//        }

//       for(int i=0; i< x.length;i++){
//            if(Character.valueOf(x[i]).equals(Character.valueOf(x[i+1])) && Character.valueOf(x[i]).equals(Character.valueOf(x[i+2]))){
//                if(Character.valueOf(x[i]).equals(c1) && !Character.valueOf(x[i]).equals(c3)) {
//                    return "Player "+c1+" won";
//                }else{
//                    return "Player "+c2+" won";
//                }
//            }
//           i=i+2;
//       }

        for(int i=0; i< x.length;i++){
            if(Character.valueOf(x[i]).equals(Character.valueOf(x[i+3])) && Character.valueOf(x[i]).equals(Character.valueOf(x[i+6]))){
                if(Character.valueOf(x[i]).equals(c1) && !Character.valueOf(x[i]).equals(c3)) {
                    return "Player "+c1+" won";
                }else if(Character.valueOf(x[i]).equals(c2) && !Character.valueOf(x[i]).equals(c3)){
                    return "Player "+c2+" won";
                }
            }
        }

       return null;
    }
}
