public class a9 {
    public static int sumOfCubes(int arr[]) {
        int sum = 0;
        for (int i = 0; i<arr.length; i++) {
            sum += Math.pow(arr[i],3);
        }
        return sum;
    }
    public static void main(String[] args) {
        int a[] = {3, 4, 5};
        System.out.println(sumOfCubes(a));
    }
}
