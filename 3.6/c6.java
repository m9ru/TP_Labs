public class c6 {
    public static boolean same(int arr1 [], int arr2 []) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i<arr1.length; i++) {
            int j;
            for (j = 0; j<i; j++) {
                if (arr1[i] == arr1[j]) {
                    break;
                }
            }
            if (i == j){
                count1++;
            }
        }
        for (int i = 0; i<arr2.length; i++) {
            int j;
            for (j = 0; j<i; j++) {
                if (arr2[i] == arr2[j]) {
                    break;
                }
            }
            if (i == j){
                count2++;
            }
        }
        if (count1 == count2){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {9,8,7,6};
        int[] arr2 = {4,4,3,1,5};
        System.out.println(same(arr1,arr2));
    }
}