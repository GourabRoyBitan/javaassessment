package com.acc.lkm.day3;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Non Generic
		//ArrayList arraylist=new ArrayList();
		ArrayList <String>arraylist=new ArrayList<String>();
		arraylist.add("Java");
		arraylist.add("Python");
		arraylist.add("SFDC");
		arraylist.add("Oracle");
		//Iterator i=arraylist.iterator();
		//while(i.hasNext()) {
		//	System.out.println(i.next());
		//}
		/*
		for (String obj:arraylist) {
			System.out.println(obj);
		}*/
		ArrayList<String> a2=new ArrayList<>();
		a2.add("Europe");
		a2.add("CloudFirst");
		a2.add("NorthAmerica");
		arraylist.addAll(a2);
		System.out.println(arraylist);
		arraylist.remove(5);
		System.out.println(arraylist);
		arraylist.removeIf(str->str.contains("java"));
		System.out.println(arraylist);
		
		
		
		
		
		
		
	}

}
