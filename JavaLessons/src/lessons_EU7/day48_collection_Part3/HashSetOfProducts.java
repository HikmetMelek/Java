package lessons_EU7.day48_collection_Part3;

import lessons_EU7.day46_collection_Part1.Product;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts{
    public static void main(String[] args) {
        Set<Product> productSet= new HashSet<>();
        productSet.add(new Product("book",25.25));
        productSet.add(new Product("book",17.99));
        productSet.add(new Product("magazine",7.80));

        System.out.println(productSet);

        //print each product by using for each loop
        for (Product p: productSet) {
            System.out.println(p);
            System.out.println(p.getPrice());
        }

        System.out.println("--------------------------------------");
        //print each product by using for each loop
        productSet.forEach(p-> System.out.println(p.getName()));

    }
}
