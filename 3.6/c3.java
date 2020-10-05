public class c3 {
    public static boolean checkPerfect(int n) {
        int sum = 0;
        int d = 1;
        while (d <= n / 2) {
            if (n % d == 0) {
                sum += d;
            }
            d += 1;
        }
        if (sum == n) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkPerfect(28));
    }
}