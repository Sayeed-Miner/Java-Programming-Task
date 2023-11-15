/*
Count number of words, number of characters without spaces, number of vowels and
consonant from the given string:
"I live in Bangladesh"
Output:
Number of words: 4
Number of chars without spaces: 17
Number of vowels: 7
Number of consonant: 10
*/

public class StringAnalysis {
    public static void main(String[] args) {
        String string = "I live in Bangladesh";
        System.out.println("Given String: ");
        System.out.println(string);
        int wordsCount = 0, charsCount = 0, vowelsCount = 0, consonantCount = 0;
        String[] words = string.split("\\s+");
        wordsCount = words.length;
        for (String word : words) {
            charsCount = charsCount + word.length();
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    char lowerCase = Character.toLowerCase(c);
                    if (lowerCase == 'a' || lowerCase == 'e' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u') {
                        vowelsCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
        }
        System.out.println("Output:");
        System.out.println("Number of words: " + wordsCount);
        System.out.println("Number of chars without spaces: " + charsCount);
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonant: " + consonantCount);
    }
}