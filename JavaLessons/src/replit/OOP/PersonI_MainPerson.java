package replit.OOP;

import java.util.Scanner;

public class PersonI_MainPerson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person = new Person();
       // System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
       // System.out.println(person.toString());
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);
        System.out.println(person.toString() );

        Person person2 = new Person(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getFirstName()); //"Melek"
        System.out.println(person2.getLastName());  //"Sun"
        System.out.println(person2.getAge());       // 42
        System.out.println(person2.toString());     //"Melek | Sun | 42"


    }
}
