public class b2 {
    public static int defferenceMaxMin(int [] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i<arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            else if (arr[i]<min) {
                min = arr[i];
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        int a[] = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(defferenceMaxMin(a));
    }
}