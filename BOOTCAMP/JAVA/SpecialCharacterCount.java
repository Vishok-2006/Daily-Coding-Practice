public class SpecialCharacterCount {
    public static void main(String[] args) {
        String str = "Hello, !@#$%^&*()World! @2024";
        int specialCharCount = countSpecialCharacters(str);
       System.out.println("Number of special characters: " + specialCharCount);
    }
    public static int countSpecialCharacters(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }
        return count;
    }
}
