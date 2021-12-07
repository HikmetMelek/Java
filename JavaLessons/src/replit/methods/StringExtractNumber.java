package replit.methods;

import java.util.Scanner;

public class StringExtractNumber {
    public static String extractNum(String s) {
        s=s.replaceAll("[^0-9]", "");
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }

}
