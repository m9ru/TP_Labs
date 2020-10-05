public class c5 {
    public static boolean isValidHexCode(String str) {
        if (str.length() != 7 || (int)str.charAt(0) != 35) {
            return false;
        }
        for (int i = 1; i<str.length(); i++) {
            if ((int)str.charAt(i) < 48 || (int)str.charAt(i) > 57 && (int)str.charAt(i) < 65 ||
                (int)str.charAt(i) > 90 && (int)str.charAt(i) < 97 || (int)str.charAt(i) > 122) {
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD[C5C"));
        System.out.println(isValidHexCode("#EAE9EE"));
        System.out.println(isValidHexCode("#ea0cee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("CD5C58C"));
    }
}