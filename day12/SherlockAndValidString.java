package com.capgemini.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class SherlockAndValidString {
	/*
	 * public static void main(String[] args) { Map<String, Integer> m = new
	 * HashMap<String, Integer>(); //Set<String> s = m.keySet();
	 * Set<Entry<String, Integer>> s = m.entrySet(); List<Entry<String,
	 * Integer>> list = new ArrayList<Map.Entry<String,Integer>>(s);
	 * Collections.sort(list, new Comparator<Entry<String, Integer>>() {
	 * 
	 * @Override public int compare(Entry<String, Integer> o1, Entry<String,
	 * Integer> o2) { return o1.getValue().compareTo(o2.getValue()); }
	 * 
	 * }); int l = list.size(); int count = 0; for(int i=1;i<l;i++) {
	 * Entry<String, Integer> e = list.get(i);
	 * if(list.get(i-1).getValue().compareTo(list.get(i).getValue()) > 0) {
	 * count++; if(count > 1) { break; } } } }
	 */
	static String isValid(String str){
        StringBuilder sb = new StringBuilder(str);
        int l = sb.length();
        
        
        Map<String, Integer> m = new HashMap<String, Integer>();
        String result = "YES";
        for(int i=0;i<l;i++)
        {
            if(m.containsKey(sb.charAt(i)+""))
            {
                m.put(sb.charAt(i)+"", m.get(sb.charAt(i)+"")+1);
            } else {
                m.put(sb.charAt(i)+"", 1);
            }
        }
        
        System.out.println(m);
        Set<Entry<String,Integer>> s = m.entrySet();
        
        List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(s);
        /*Collections.sort(list, new Comparator<Entry<String, Integer>>(){
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });*/
        System.out.println(list);
        Integer firstValue = new Integer(list.get(0).getValue());
        int count = 0;
        l = list.size();
        for(int i=1;i<l;i++)
        {
            System.out.println("list.get(i-1).getValue().compareTo(list.get(i).getValue()) = "+list.get(i-1).getValue().compareTo(list.get(i).getValue()));
            if(firstValue.compareTo(list.get(i).getValue()) != 0)
            {
            	//firstValue = list.get(i).getValue();
                count++;
                if(count>1 || (firstValue - list.get(i).getValue()) < -1 )
                {
                    result = "NO";
                    break;
                } 
                //System.out.println(count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
