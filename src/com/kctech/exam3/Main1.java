package com.kctech.exam3;

public class Main1
{ 
	public static void main (String[] args)
	{ 
		System.out.println(print(1)); 
		} 
	static Exception print(int i)
	{ 
		if (i>0) 
	{ 
			return new Exception();
			} 
		else 
		{ 
			throw new RuntimeException(); 
			} 
		} 
	}