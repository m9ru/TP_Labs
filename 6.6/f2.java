public class f2 {
    public static String translateWord(String str) {
        int i = 0;
        if (str.length() > 0) {
            if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' ||
                str.charAt(0) == 'o' || str.charAt(0) == 'u' || str.charAt(0) == 'y' ||
                str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' ||
                str.charAt(0) == 'O' || str.charAt(0) == 'U' || str.charAt(0) == 'Y')
                    str += "yay";
            else {
                i = 1;
                while (i<str.length() && str.charAt(i) != 'a' && str.charAt(i) != 'e' &&
                    str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'y')
                        i++;
            }
            if (i != 0) {
                if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
                    str = str.toLowerCase();
                    str = str.substring(0, i) + str.substring(i,i+1).toUpperCase() + str.substring(i+1,str.length());
                }
                str = str.substring(i, str.length()) + str.substring(0, i) + "ay";
            }
        }
        return str;
    }
    public static String translateSentence(String str) {
        int i = 0;
        String buf = "", str2 = "";
        while (i < str.length()) {
            while (str.charAt(i) >= 65 && str.charAt(i) <= 90 ||
                    str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                        buf += str.charAt(i);
                        i++;
            }
            str2 += translateWord(buf) + str.charAt(i);
            buf = "";
            i++;
        }
        return str2;
    }
    public static void main(String[] args) {
        System.out.println(translateWord("s"));
        System.out.println(translateSentence("Do you think it is going to rain today?"));
    }
}