package com.kctech.exam4;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Arrays;

class AnagramProgram {
	public static void main(String args[])
	{
		
		
			String[] firstWords= {"Dormitory",
					"School master",
					"Conversation",
					"Listen",
					"Astronomer",
					"The eyes",
					"A gentleman",
					"Funeral",
					"The Morse Code",
					"Eleven plus two",
					"Slot machines", 
					"Fourth of July",
					"hello","iceman"};
			String[] secondWords= {" Dirty room",
					"The classroom",
					"Voices rant on",
					"Silent",
					"Moon starer",
					" They see",
					" Elegant man",
					"Real fun",
					" Here come dots",
					" Twelve plus one",
					" Cash lost in me",
					"Joyful Fourth","hello","cinema"};
	        for (int i = 0; i < firstWords.length; i++) {
	            char[] s0 = firstWords[i].toCharArray();
	            char[] s1 = secondWords[i].toCharArray();
	            Arrays.sort(s0);
	            Arrays.sort(s1);
	            if (Arrays.equals(s0, s1))
	                System.out.println("1");
	            else
	                System.out.println("0");
	        }
	    }
	
    }


