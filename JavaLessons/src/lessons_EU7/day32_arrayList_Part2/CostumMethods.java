package lessons_EU7.day32_arrayList_Part2;

import java.util.ArrayList;
import java.util.Random;

public class CostumMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		System.out.println();
		double sum= sumList(doubleList);
		System.out.println(sum);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list= getlist(15);
		System.out.println(list.toString());
		
		ArrayList<Integer> randomlist= getRandomlist(8);
		System.out.println(randomlist.toString());
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		//System.out.println(strnums); // strnums is String
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted); // strnums is integer

	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> str) {
		
		ArrayList<Integer> newList= new ArrayList<>();
		
		for(String i: str) {
			newList.add(Integer.parseInt(i)) ;
		}
		
		return newList;
	}

	public static ArrayList<Integer> getRandomlist(int n) {
		Random rn= new Random();
		
		ArrayList<Integer> newList= new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			newList.add(rn.nextInt(101));
		}
		return newList;
	}

	public static ArrayList<Integer> getlist(int num) {
		
		ArrayList<Integer> newList= new ArrayList<>();
		
		for (int i=0; i< num; i++) {
			newList.add(i+1);
		}
		return newList;
	}

	public static double sumList(ArrayList<Double> dList) {
		double sumAll=0;
		for(Double i: dList)
			sumAll+=i;
		return sumAll;
	}

	public static void printList(ArrayList<Integer> numsList) {
		
		for (Integer i: numsList) { //for(int i: numsList) also done
			System.out.print(i+" ");
		}
		
	}

}
