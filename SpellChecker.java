
public class SpellChecker {


	public static void main(String[] args) {
		String word = args[0];
		int threshold = Integer.parseInt(args[1]);
		String[] dictionary = readDictionary("dictionary.txt");
		String correction = spellChecker(word, threshold, dictionary);
		System.out.println(correction);
		
	}

	public static String tail(String str) {
		if (str.length() == 1){
			return " ";
		}
		
		else {
			return tail(str.substring(1));
		}
	
	}

	public static int levenshtein(String word1, String word2) {
	word1 = word1.toLowerCase();
	word2 = word2.toLowerCase();
	int lengthWord1 = word1.length();
	int lengthWord2 = word2.length();
	int insert = 0;
	int delete = 0;
	int replace = 0;

	if (lengthWord1 == 0) {
		return lengthWord2;

	}
	if (lengthWord2 == 0) {
		return lengthWord1;
	}
	
	if (word1.charAt(0) == word2.charAt(0)) {
		return levenshtein(tail(word1), tail(word2));
	}
	else if {
		return levenshtein(tail(word1), word2) +1;

	}
	else if {
		return levenshtein(word1, tail(word2)) +1;

	}
	else if {
		return levenshtein(tail(word1), tail(word2)) +1;
	}
	
	return Math.min(Math.min(insert, delete), replace);
	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];

		In in = new In(fileName);

		// Your code here

		return dictionary;
	}

	public static String spellChecker(String word, int threshold, String[] dictionary) {
		// Your code goes here
	}

}
