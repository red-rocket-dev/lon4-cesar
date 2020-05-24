package pl.sda;

public class Main {

    public static void main(String[] args) {
	// szyfr cezara - implementacja
        String toEncode = "123";
        char ch = 'a';
        int afterShift = ch + 3;
        char afterShiftChar = (char) afterShift;
        System.out.println(afterShiftChar);
        int shift = 10;
    }
}
