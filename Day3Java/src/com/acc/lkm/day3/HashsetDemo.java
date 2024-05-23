package com.acc.lkm.day3;
import java.util.*;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> hashset= new HashSet<>();
		hashset.add("Spring");
		hashset.add("Hibernate");
		hashset.add("Microservice");
		hashset.add("Maven");
		for(String obj:hashset) {
			System.out.println(obj);
		}
		LinkedHashSet<String> hs2=new LinkedHashSet<>();
		
		

	}

}
