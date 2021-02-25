package com.kctech.exam2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test12
{
	public static void main(String args[])
	{

ArrayList<Integer>ints = (ArrayList<Integer>) Stream.of(5 , 3 , 4 , 55 , 2 ,22,123,545,33,242).collect(Collectors.toList());
Integer maxInt = ints.stream()
                          .max(Comparator.comparing(i -> i))
                          .get();

System.out.println("Maximum number in the set is " + maxInt);
}
}