public class e3 {
    public static boolean canComplete(String mask, String word) {
        int cur = 0;
        for (int i=0; i<mask.length(); i++) {
            while (cur < word.length() && word.charAt(cur) != mask.charAt(i))
                cur++;
            cur++;
            if (cur > word.length())
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canComplete("bbutful", "beautiful"));
    }
}