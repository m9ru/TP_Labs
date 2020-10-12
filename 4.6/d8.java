public class d8 {
    public static boolean doesRhyme(String str1, String str2) {
        int count1 = str1.length() - 1;
        int count2 = str2.length() - 1;
        String s1 = "", s2 = "";
        while (str1.charAt(count1) != ' ') {
            count1--;
        }
        while (str2.charAt(count2) != ' ') {
            count2--;
        }
        str1 = str1.toLowerCase().substring(count1 + 1, str1.length());
        for (int i = 0; i<str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                s1 += str1.charAt(i);
            }
        }
        str2 = str2.toLowerCase().substring(count2 + 1, str2.length());
        for (int i = 0; i<str1.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u') {
                s2 += str2.charAt(i);
            }
        }
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I aym!", "Green eggs and hame."));
    }
}