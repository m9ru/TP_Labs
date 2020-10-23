public class f7 {
    public static String longestNonrepeatingSubstring(String str)
    {
        String buf = "", res = "";
        for (int i=0; i<str.length()-1; i++) {
            buf += str.charAt(i);
            if (buf.indexOf(str.charAt(i+1)) != -1) {
                if (res.length() < buf.length())
                    res = buf;
                buf = "";
            }
        }
        if (str.length() == 1)
            res = str;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(longestNonrepeatingSubstring("abcda"));
    }
}