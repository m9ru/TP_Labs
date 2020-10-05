public class c7 {
    public static boolean isKaprekar(int n) {
        String str = Integer.toString((int)Math.pow(n,2));
        String str1 = str.substring(0,str.length()/2);
        String str2 = str.substring(str.length()/2, str.length());
        int a1 = Integer.parseInt(str1);
        int a2 = Integer.parseInt(str2);
        if (a1 + a2 == n) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isKaprekar(297));
    }
}