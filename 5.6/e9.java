public class e9 {
    public static String correctTitle(String str) {
        String buf = "", res = "";
        int i = 0;
        while (i<str.length()) {
            while (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                buf += str.charAt(i);
                i++;
            }
            buf = buf.toLowerCase();
            if (!buf.equals("and") && 
                !buf.equals("the") && 
                !buf.equals("of") && 
                !buf.equals("in") && 
                buf.length() >= 1)
                    buf = buf.substring(0,1).toUpperCase() + buf.substring(1,buf.length());
            res += buf + str.charAt(i);
            buf = "";
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(correctTitle("jOn SnoW, kINg-mAn IN thE noRth."));
    }
}