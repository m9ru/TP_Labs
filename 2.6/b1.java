public class b1 {
    public static String repeat(String S, int N) {
        String sRes = "";
        char arr[] = S.toCharArray();
        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<N; j++) {
                sRes += arr[i];
            }
        }
        return sRes;
    }
    public static void main(String[] args) {
        System.out.println(repeat("mice", 2));
    }
}