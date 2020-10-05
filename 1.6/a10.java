public class a10 {
    public static boolean abcmath(int a, int b, int c) {
        if (a * Math.pow(2,b) % c == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(abcmath(5,2,10));
    }
}
