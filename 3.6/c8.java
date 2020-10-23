public class c8 {
    public static String longestZero(String str) {
        int max = 0;
        int cur = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '0') {
                cur++;
            }
            else {
                if (cur>max) {
                    max = cur;
                    cur = 0;
                }
            }
            if (cur>max && i == str.length()-1) {
                max = cur;
                cur = 0;
            }
        }
        String ans = "";
        for (int i = 0; i<max; i++) {
            ans += "0";
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestZero("01100010110000"));
    }
}