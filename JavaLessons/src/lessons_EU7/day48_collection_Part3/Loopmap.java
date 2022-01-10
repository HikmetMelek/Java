package lessons_EU7.day48_collection_Part3;

import lessons_EU7.day46_collection_Part1.Product;

import java.util.*;

public class Loopmap {
    public static void main(String[] args) {

        Map<String,String> dataMap = new HashMap<>();

        dataMap.put("url", "qa3.vytrack.com");
        dataMap.put("username", "user66");
        dataMap.put("password", "abc66");
        dataMap.put("browser", "chrome");
        dataMap.put("truckdriver", "Bob");
        dataMap.put("storemanager", "John");

        //keySet - > returns set with all the keys in the map
        //values - > returns with all the values in the map
        System.out.println("++++KEYS++++");
        for (String s : dataMap.keySet()) {
            System.out.println(s);
        }

        System.out.println("++++VALUES++++");
        for (String s : dataMap.values()) {
            System.out.println(s);
        }

        System.out.println("++++KEY + VALUES++++");
        for (String s : dataMap.keySet()) {
            System.out.print(s+": ");
            System.out.println(dataMap.get(s));
        }

        System.out.println("++++foreach loop++++");
        //Looping by using forEach method
       dataMap.forEach((k,v)-> System.out.print(k+": "+v+"    "));

        Map<Integer, Product> studentMap = new HashMap<>();
        Map<String,String[]> data = new HashMap<>();
        Map<Integer,List<String>> data2 = new HashMap<>();
        Map<Integer,List<String[]>> data3 = new HashMap<>();
        Map<String,Map<Integer,Integer>> data4 = new HashMap<>();
        Map<String,Map<Integer,Product>> data5 = new HashMap<>();

    }
}
