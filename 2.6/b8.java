public class b8 {
    public static boolean isStrangePair(String str1, String str2) {
        if (str1.charAt(0) == str2.charAt(str2.length()-1) && str2.charAt(0) == str1.charAt(str1.length()-1)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isStrangePair("sparkling", "groups"));
    }
}