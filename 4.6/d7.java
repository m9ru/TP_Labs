public class d7 {
    public static String toStarShorthand(String str) {
        String s = "";
        char prev = (char) 0;
        int count = 0;
        for (int i = 0; i<str.length(); i++) {
            if (prev != str.charAt(i)) {
                if (count > 1) {
                    s += "*" + count;
                }
                prev = str.charAt(i);
                s += prev;
                count = 1;
            }
            else {
                count++;
                if (i == str.length() - 1 && count > 1) {
                    s += "*" + count;
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(toStarShorthand("abbccc"));
    }
}