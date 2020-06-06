package pl.sda;

public class Main {

    public static void main(String[] args) {
        // szyfr cezara - implementacja
        int shift = 3;
        String encoded = encode("AbCd", shift);
        System.out.println(encoded);
        System.out.println(decrypt(encoded, 3));
    }

    public static String encode(String word, int shift) {
        StringBuilder encodedSb = new StringBuilder();
        char[] table = word.toCharArray();
        for (int i = 0; i < table.length; i++) {
            char letter = table[i];
            int ascii = letter;
            int afterShift = ascii + shift;
            char letterAfterShift = (char) afterShift;
            encodedSb.append(letterAfterShift);
        }
        return encodedSb.toString();
    }

    public static String decrypt(String encodedWord, int shift) {
        StringBuilder encodedSb = new StringBuilder();
        char[] table = encodedWord.toCharArray();
        for (int i = 0; i < table.length; i++) {
            char letter = table[i];
            int ascii = letter;
            int afterShift = ascii - shift;
            char letterAfterShift = (char) afterShift;
            encodedSb.append(letterAfterShift);
        }
        return encodedSb.toString();
    }

    public static String decryptAlphabet(String cipherText, int shift) {
        String plainText = "";
        int length = cipherText.length();
        for (int i = 0; i < length; i++) {
            char ch = cipherText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'a') {
                        plainText += (char) (ch + (26 - shift));
                    } else {
                        plainText += c;
                    }
                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - shift);
                    if (c < 'A') {
                        plainText += (char) (ch - (26 - shift));
                    } else {
                        plainText += c;
                    }
                }
            } else {
                plainText += ch;
            }
        }
        return plainText;
    }

}
