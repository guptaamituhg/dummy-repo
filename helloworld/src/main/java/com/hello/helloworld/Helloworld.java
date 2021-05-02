package com.hello.helloworld;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

//class hello{
//	
//	public void print()
//	{
//		System.out.println("###helloworld");
//	}
//}

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet t = new TreeSet(new mycom());
//		t.add("Roja");
//		t.add("Sobha Rani");
//		t.add("Raja Kumari");
//		
//		System.out.println(t);
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Chiru", 700);
		map.put("Bala", 900);
		map.put("Venki", 200);
		map.put("Nag", 500);
		System.out.println(map);
		
		Set s = map.keySet();
		System.out.println(s);
		
		Collection c = map.values();
		
		System.out.println(c);
		
		Set s1 = map.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m1=(Entry) itr.next();
			
			System.out.println(m1.getKey()+"  "+m1.getValue());
			
		}
		
	}

}

//class mycom implements Comparator{
//	
//	
//
//	public int compare(Object one, Object two) {
//		// TODO Auto-generated method stub
//		
//		String first = one.toString();
//		String second = (String) two;
//		
//		return second.compareTo(first);
//		
//		
//	}
//	
//	
//}
