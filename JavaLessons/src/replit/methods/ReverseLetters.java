package replit.methods;

import java.util.*;

public class ReverseLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

//        Scanner in = new Scanner(System.in);
//        System.out.println(reverseNoSpec(in.next()));
//        String str = "A[b#h&de!$yt]er";
//        System.out.println(reverseNoSpec(str));

    }

    public static String reverseNoSpec(String str) { //Ab,c,de!$yter

        // your code here
        char[] rev = str.toCharArray();
        // System.out.println(Arrays.toString(rev));
        int lR = 0, rL = str.length()-1;
        String nonAlphabetic = str.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(nonAlphabetic);

        for( ; lR<rL ;){

            if(nonAlphabetic.contains(""+rev[lR])){
                lR++;
                continue;
            }
            if(nonAlphabetic.contains(""+rev[rL])){
                rL--;
                continue;
            }
            char dummy = rev[rL];
            rev[rL] = rev[lR];
            rev[lR] = dummy;
            lR++;
            rL--;
        }
        return String.valueOf(rev);
    }

}
