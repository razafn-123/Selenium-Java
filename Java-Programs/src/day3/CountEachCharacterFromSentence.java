package day3;

import java.util.HashMap;

public class CountEachCharacterFromSentence {

	public static void main(String[] args) {
		
		String str = "Java is a Programming language, Java is widely used in software testing.";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] charArray = str.toCharArray();
		
		for(char ch : charArray) {
			
			if(ch != ' ') {
			
				if(map.containsKey(ch)) {
					
					map.put(ch, map.get(ch)+1);
				}
				else {
					
					map.put(ch, 1);
				}
			}
		}
		
		System.out.println(map);
		
	}
}