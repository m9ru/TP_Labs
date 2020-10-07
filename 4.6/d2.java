public class d2 {
    public static String split(String s) {
        String s1 = "[";
        int open = 0;
        int close = 0;
        for (int i=0; i<s.length(); i++) {
            if (open == 0) {
                s1 += "\"";
            }
            if (s.charAt(i) == '(') {
                open++;
                s1 += '(';
            }
            else if (s.charAt(i) == ')') {
                close++;
                s1 += ')';
            }
            if (open == close) {
                s1 += "\"";
                if (i+1 != s.length()) {
                    s1 += ", ";
                }
                open = 0;
                close = 0;
            }
        }
        s1 += "]";
        return s1;
    }
    public static void main(String[] args) {
        String str = "((())())(()(()()))";
        System.out.println(split(str));
    }
}