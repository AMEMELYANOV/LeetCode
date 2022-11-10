package programmer_career.Exersise_01;

public class Ex1_1 {
    public static boolean isCharOne(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = chars[i];
            for (int j = i + 1; j < chars.length; j++) {
                if (currentChar == chars[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "asdfghjea";
        System.out.println(isCharOne(str));
    }
}
