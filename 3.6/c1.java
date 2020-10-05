public class c1 {
    public static int solutions(int a, int b, int c) {
        if (Math.pow(b, 2) - 4 * a * c > 0){
            return 2;
        }
        else if (Math.pow(b, 2) - 4 * a * c < 0) {
            return 0;
        }
        else return 1;
    }
    public static void main(String[] args) {
        System.out.println(solutions(1,0,1));
    }
}