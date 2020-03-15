package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCountDemo {
	
	
	
	public static void main(String[] args) {
		
		String str = "this is is this demo example demo";
		String str1 = "sushant";
		
		
		char[] c = str1.toCharArray();
		
		
		TreeMap<String,Integer> tm  = new TreeMap<String,Integer>();
		HashMap<Character,Integer> hm  = new HashMap<Character,Integer>();
		
		for(String input : str.split(" ")){
			if(tm.containsKey(input))
				tm.put(input, tm.get(input)+1);
			else
				tm.put(input, 1);
		}
		
		for(Map.Entry entry : tm.entrySet())
			System.out.println(entry.getKey() +"  "+ entry.getValue());
		
		System.out.println("=======================================================");
		
		for(char ch : c){
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
		}
		
		for(Map.Entry entry : hm.entrySet())
			System.out.println(entry.getKey() +"  "+ entry.getValue());
		
	
	}
		
}
