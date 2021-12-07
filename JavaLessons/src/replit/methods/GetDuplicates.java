package replit.methods;

import java.util.*;

public class GetDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        System.out.println(getDup(strs));
    }
    public static int getDup(String[] r) {
       int dummy=0;
       for(int i=0; i<r.length;i++){
           int counter=1;
           for(int j=i+1; j<r.length; j++){
               if(r[i].equals(r[j])){
                   counter++;
                   r[j]= "zzz£#zz"+j; // duplicate olanlar degisiyor
               }
           }
        if(counter>1)
            dummy+=counter;
       }
        return dummy;
    }



}
//    public static int getDup(String[] r) { //"1","g","aabb","7","7","2","aa","7"
//        ArrayList<String> dupStr = new ArrayList<>(); //7, 7,7
//
//        for(int i=0; i<r.length; i++){
//            if(dupStr.contains(r[i])){
//                continue;
//            }
//            dupStr.add(r[i]);
//            int index = dupStr.indexOf(r[i]);
//            boolean dup = false;
//            for (int j=i; j<r.length-1; j++){
//                if(r[i].equals(r[j+1])){
//                    dupStr.add(r[i]);
//                    dup = true;
//                }
//
//            }
//            if(!dup){
//                dupStr.remove(index);
//            }
//
//        }
//
//        return dupStr.size();
//
//    }
//
//    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        String [] strs = new String[in.nextInt()];
////        for(int i=0; i < strs.length; i++) {
////            strs[i] = in.next();
////        }
//        String[] strs = {"1","g","aabb","7","7","2","aa","7"};
//
//        System.out.println(String.valueOf(getDup(strs)).trim());
//
//    }