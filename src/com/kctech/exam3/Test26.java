package com.kctech.exam3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test26 {   
    public static void main(String[] args) {  
        ArrayList<String> l = new ArrayList<String>();  
        l.add("tata");  
        l.add("bmw");  
        l.add("benz");  
        l.add("tata");  
        System.out.println(l.toString());  
        Set<String> s = new LinkedHashSet<String>(l);  
        System.out.println(s);  
    }  
}  