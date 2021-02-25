package com.kctech.exam3;

import java.util.ArrayList;
import java.util.Comparator;

public class Test27 {
	public static void main(String args[])
	{
		ArrayList<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("D");    
        myList.add("C");
        myList.add("B");
        myList.sort(Comparator.comparing(s -> s));
        myList.forEach(System.out::println);
}
}

	


