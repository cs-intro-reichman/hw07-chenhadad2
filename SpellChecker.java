
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
		
		else (str.length() > 1) {
			
			return tail(str.substring(1));
		}
		

	}

	public static int levenshtein(String word1, String word2) {
	int lengthWord1 = word1.length();
	int lengthWord2 = word2.length();
	int sum = 0;
	if (lengthWord1 == 0) {
		return word2.length();

	}
	if (lengthWord2 == 0) {
		return word1.length();
	}
	
	if (word1.charAt(0) != word2.charAt(0)) {
		sum = 1;
	}
		int insert = levenshtein (tail(word1),word2) +1 ;
		 int delete = levenshtein(word1, tail(word2)) +1;
		 int substitude = levenshtein(tail(word1), tail(word2)) + sum;
	
	return Math.min(Math.min(insert, delete), substitude);
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
