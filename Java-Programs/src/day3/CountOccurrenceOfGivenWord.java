package day3;

public class CountOccurrenceOfGivenWord {

	public static void main(String[] args) {
		
		/*
		 * Here, W.A.P to find the occurence of word present in given sentence.
		 * 
		 * 
		 */
		
		String str = "Java is a Programming language, Java is widely used in software testing.";
		
		String word = "java";
		
		String[] occurence = str.toLowerCase().split("\\s");
		
		int count = 0;
		
		for(int i = 0; i < occurence.length; i++ ) {
			
			if(word.equals(occurence[i])) {
				
				count++;
			}
		}
		
		System.out.println(count);
	}
}