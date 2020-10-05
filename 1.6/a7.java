public class a7 {
    public static int addUpTo(int N) {
        int sum = 0;
        for (int i=1; i<N+1; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(addUpTo(10));
    }
}
