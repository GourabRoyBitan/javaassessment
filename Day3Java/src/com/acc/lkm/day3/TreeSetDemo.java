package com.acc.lkm.day3;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Java");
		ts.add("Python");
		ts.add("Spring");
		ts.add("Gour");
		System.out.println(ts);
		/*for(String obj:ts) {
			System.out.println(obj);
		}*/
		//PollLast:
		System.out.println(ts.pollLast());
		System.out.println(ts.pollFirst());
		
			

	}

}
