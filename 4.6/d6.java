public class d6 {
    public static int bugger(int n) {
        int count = 0, mult, i;
        String num = Integer.toString(n);
        while (num.length() > 1) {
            mult = 1;
            for (i=0; i<num.length(); i++) {
                mult *= Integer.parseInt("" + num.charAt(i));
            }
            num = Integer.toString(mult);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(bugger(999));
    }
}