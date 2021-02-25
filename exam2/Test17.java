package com.kctech.exam2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class Test17 {
 
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("martin");
		names.add("pradeep");
		names.add("belbin");
 
		Collections.sort(names, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s1.compareTo(s2);
		    }
		});
 
		for (String s : names) {
			System.out.println(s);
		}
	}
}
