package com.kctech.exam3;

package mypackage; 
public class Math 
{ 
	public static int abs(int num)
	{ 
		return num < 0 ? -num : num; 
		} 
	} 
package mypackage.elementary; 
public class Math 
{ 
	public static int abs (int num)
	{
		return -num; 
		} 
	} 
import mypackage.Math; 
import mypackage.elementary.*; 
class Main 
{ 
	public static void main (String args[])
	{ 
		System.out.println(Math.abs(123));
		} 
	}
