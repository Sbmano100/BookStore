package com.BookStore.App.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapsort {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "zia");
		map.put(2,"Nandhu");
		map.put(3, "Raj");
		//System.out.println(map.entrySet());
		Set<Entry<Integer,String>> entry=map.entrySet();   //set
		List<Entry<Integer,String>> list=new ArrayList<>(entry);  //list
		System.out.println("Before Sorting"+"\n"+list);
		
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>>() {
			@Override
			public int compare(Map.Entry<Integer,String> o1,Map.Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println("After Sorting"+"\n"+list);
		
		LinkedHashMap<Integer,String> lmap=new LinkedHashMap<>();
		for(Entry<Integer,String> i:list) {
			lmap.put(i.getKey(),i.getValue());
		}
		System.out.println("LinkedHashMap after Sorting"+"\n"+lmap);
		
	}

}
