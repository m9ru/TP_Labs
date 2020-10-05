public class c9 {
    public static int nextPrime(int n) {
        int count;
        while(true) {
            count = 0;
            for (int i = 2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return n;
            }
            else {
                n++;
                continue;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(nextPrime(23));
    }
}