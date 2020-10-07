public class d1 {
    public static String textproc(int n, int k, String s) {
        int charNum = 0;
        int lastSpace = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != ' ') {
                charNum++;
            }
            else {
                lastSpace = i;
            }
            if (charNum > k && lastSpace != 0) {
                charNum = i - lastSpace;
                s = s.substring(0,lastSpace) + "\n" + s.substring(lastSpace+1,s.length());
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int n = 10;
        int k = 7;
        String str = "hello my name is Bessie and this is my essay";
        System.out.println(textproc(n,k,str));
    }
}