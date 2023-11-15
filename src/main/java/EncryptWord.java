/*
Encrypt word: ROADTOSDET [when A=F]
Output: WTFIYTXIJY
*/

public class EncryptWord {
    public static void main(String[] args) {
        String originalWord = "ROADTOSDET";
        String encryptedWord = encrypt(originalWord);
        System.out.println("Given Word to Encrypt: " + originalWord);
        System.out.println("Output: " + encryptedWord);
    }
    private static String encrypt(String word) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
                if (Character.isUpperCase(currentChar)) {
                    int newPosition = (currentChar - 'A' + 5) % 26;
                    char encryptedChar = (char) ('A' + newPosition);
                    encrypted.append(encryptedChar);
                } else {
                    encrypted.append(currentChar);
                }
            }
        return encrypted.toString();
    }
}