public class e1 {
    public static String decrypt(int[] arr) {
        String s = "";
        for (int i=0; i<arr.length; i++) {
            if (i!=0)
                s += (char)(arr[i]+s.charAt(i-1));
            else
                s += (char)arr[i];
        }
        return s;
    }
    public static int[] encrypt(String str) {
        int[] arr = new int[str.length()];
        for (int i=0; i<str.length(); i++) {
            if (i!=0)
                arr[i] = (int) str.charAt(i) - (int) str.charAt(i-1);
            else
                arr[i] = (int) str.charAt(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {72, 33, -73, 84, -12, -3, 13, -13, -68};
        System.out.println(decrypt(arr));
        String str = "Hello";
        int[] arr2 = encrypt(str);
        for (int i=0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}