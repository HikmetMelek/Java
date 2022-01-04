package lessons_EU7.day46_collection_Part1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArraylist {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("js");
        list.add("html");
        list.add("ruby");
        list.add("kotlin");
        list.add("c++");

        System.out.println("Before sorting");
        System.out.println(list.toString());

        System.out.println("after sorting");
        Collections.sort(list);
        System.out.println(list.toString());

        List<Product> productList =  new ArrayList<>();

        Product p = new Product("table", 81.36);
        productList.add(p);
        productList.add(new Product("spoon", 13.99));
        productList.add(new Product("bag", 100.00));
        productList.add(new Product("shoes", 59.99));
        productList.add(new Product("computer", 2100.59));

        System.out.println("Before sorting");
        System.out.println(productList.toString());

        System.out.println("After sorting");
        Collections.sort(productList);//by calling compareTo method that is overridden from Comparable<T> interface in Product class
        System.out.println(productList.toString());

        System.out.println("======================");
        Product p1 = new Product("spoon", 25.34);
        Product p2 = new Product("chair", 7.99);
        System.out.println(p1.compareTo(p2));
        System.out.println("======================");

    }

}
