package day3;

public class RemoveSpaceFromSentence {

	public static void main(String[] args) {
		
		String sentence = "Raza is handsome!!!";
		
		sentence = sentence.replaceAll("\\s", "");
		
		System.out.print(sentence);
		
	}
}