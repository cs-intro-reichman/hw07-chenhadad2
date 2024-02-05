

public class HashTagTokenizer {

	public static void main(String[] args) {

		String hashTag = args[0];
		String[] dictionary = readDictionary("dictionary.txt");
		
		
		
	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];

		In in = new In(fileName);
		for (int i = 0; i<3000; i++){
			dictionary[i] = in.readString();
		}

		return dictionary;
	}

		

	public static boolean existInDictionary(String word, String []dictionary) {
		boolean indictionary = false;
		int counter = 0;
	
		for (int i = 0; i < dictionary.length; i++){
			if ((dictionary[i].length() == word.length()) && (dictionary[i].length() > 0))  {

				for (int j = 0; j < word.length(); j++){
					if (dictionary[i].charAt(j) == word.charAt(j)){
						counter = counter + 1;
					}
					
				}
				if (counter == word.length()) {
					return true;
				}
				counter = 0;

			}
		}
		
		return indictionary;
	}

		


		
	

	public static void breakHashTag(String hashtag, String[] dictionary) {

		// Base case: do nothing (return) if hashtag is an empty string.
        if (hashtag.isEmpty()) {
            return;
        }
 
        int N = hashtag.length();
		String word;
		hashtag = hashtag.toLowerCase();

        for (int i = 1; i <= N; i++) {
			word = hashtag.substring(0, i);
			if (existInDictionary(word, dictionary)){
				System.out.println(word);
				breakHashTag(hashtag.substring(i), dictionary);
				break;
			}
        }


    }

}
