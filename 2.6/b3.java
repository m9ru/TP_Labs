public class b3 {
    public static boolean isAvgWhole(int [] arr) {
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
        if (sum % arr.length == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 3};
        System.out.println(isAvgWhole(a));
    }
}