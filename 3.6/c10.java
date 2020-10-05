public class c10 {
    public static boolean rightTriangle(int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
            Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) ||
            Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
                return true;
            }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(rightTriangle(145,100,105));
    }
}