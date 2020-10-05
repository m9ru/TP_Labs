public class b7 {
    public static boolean isValid(String str) {
        char[] arr = str.toCharArray();
        if (arr.length > 5 || arr.length == 0) {
            return false;
        }
        for (int i=0; i<arr.length; i++) {
            if ((int)arr[i] < 48 || (int)arr[i]>57)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isValid("56 34"));
    }
}