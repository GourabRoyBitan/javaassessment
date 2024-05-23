package com.acc.lkm.day3;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		map.put(100, "Aman");
		map.put(200, "Subham");
		map.put(300, "Bikash");
		map.put(100, "prakash");
		map.put(null, "soumi");
		map.put(null, "Sakshi");
		
		//for(Map.Entry m1:map.entrySet()) {
			//System.out.println(m1.getKey()+" "+m1.getValue());
		//}
		//map.entrySet().stream()
		//.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		System.out.println(map);
		map.remove(null);
		//System.out.println(map);
		//map.remove(null,"Sakshi");
		//System.out.println(map);
		map.replace(300,"Akash");
		System.out.println(map);

	}

}
