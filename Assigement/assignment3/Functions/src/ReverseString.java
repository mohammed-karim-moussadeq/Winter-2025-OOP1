public class ReverseString {
    public static String reverseString( String str) {
        // checking if the string isn't empty
        if (str == null || str.length() <= 1) {
            return str;
        }
        // reversing the string
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

