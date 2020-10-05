public class b4 {
    public static void cumulativeSum(int [] arr) {
        for (int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 3};
        cumulativeSum(a);
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}