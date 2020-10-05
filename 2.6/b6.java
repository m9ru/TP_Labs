public class b6 {
    public static int Fibonacci(int n) {
        int a = 1;
        int b = 1;
        int next;
        for (int i = 2; i <= n; ++i) {
            next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}