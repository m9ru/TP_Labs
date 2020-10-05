public class a5 {
    public static String operation(int N, int a, int b) {
        if (a + b == N) {
            return ("added");
        }
        else if (a - b == N) {
            return ("subtracted");
        }
        else if (a * b == N) {
            return ("multiplied");
        }
        else if (a / (b * 1.0) == N) {
            return ("divided");
        }
        else return ("none");
    }
    public static void main(String[] args) {
        System.out.println(operation(5,11,2));
    }
}
