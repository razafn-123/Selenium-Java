package day5;

import java.util.HashMap;

/*
 * longest substring without repeating character - use a sliding window and
 * HashMap to find the length of the greatest substring without duplicate
 * character
 * 
 */

public class LongestSubString {

	public static void main(String[] args) {
		
		String input = "abcddca";
		
		int length = longestSubString(input);
		
		System.out.println(length);
	}
	
	
	public static  int longestSubString(String str) {
		
		int start = 0 ;
		
		int maxLength = 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		
		for(int end = 0; end < str.length(); end++) {
		
			char character = str.charAt(end);
			
			if(map.containsKey(character)) {
			
				start = Math.max(start, map.get(character) + 1);
			}
			map.put(character, end);
			
			maxLength = Math.max(maxLength, end - start + 1);
			
		}
		
		return maxLength;
	}
}