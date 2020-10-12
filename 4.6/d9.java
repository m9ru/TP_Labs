public class d9 {
    public static boolean trouble(long num1, long num2) {
        int i = 0, j = 0;
        String s1 = Long.toString(num1);
        String s2 = Long.toString(num2);
        while (i<s1.length()-2) {
            if (s1.charAt(i) == s1.charAt(i+1) && s1.charAt(i) == s1.charAt(i+2)) {
                while (j<s2.length()-1) {
                    if (s2.charAt(j) == s2.charAt(j+1) && s2.charAt(j) == s1.charAt(i))
                    {
                        return true;
                    }
                    j++;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(trouble(666789, 12345667));
    }
}