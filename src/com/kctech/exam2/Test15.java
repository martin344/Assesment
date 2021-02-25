package com.kctech.exam2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Test15 {
	public static void main(String args[])
	{
		ArrayList<Integer> numbers = (ArrayList<Integer>) Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	 System.out.println( numbers.stream()
             .distinct()
             .map(n -> n+"\t"+n*n) 
             .collect(Collectors.joining("\n")) 
           );
		}
	}


