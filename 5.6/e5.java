public class e5 {
    public static String[] sameVowelGroup(String[] arr) {
        boolean[] vovels = {false, false, false, false, false}; //a,e,i,o,u
        String[] res = new String[arr.length];
        res[0] = arr[0];
        int cur = 1;
        for (int i=0; i<arr[0].length(); i++) {
            if (arr[0].charAt(i) == 'a')
                vovels[0] = true;
            else if (arr[0].charAt(i) == 'e')
                vovels[1] = true;
            else if (arr[0].charAt(i) == 'i')
                vovels[2] = true;
            else if (arr[0].charAt(i) == 'o')
                vovels[3] = true;
            else if (arr[0].charAt(i) == 'u')
                vovels[4] = true;
        }
        for (int i=1; i<arr.length; i++) {
            if ((!(arr[i].indexOf('a') != -1) || vovels[0]) &&
                (!(arr[i].indexOf('e') != -1) || vovels[1]) &&
                (!(arr[i].indexOf('i') != -1) || vovels[2]) &&
                (!(arr[i].indexOf('o') != -1) || vovels[3]) &&
                (!(arr[i].indexOf('u') != -1) || vovels[4])) {
                    res[cur] = arr[i];
                    cur++;
                }
        }
        return res;
    }
    public static void main(String[] args) {
        String[] arr = {"many", "carriage", "emit", "apricot", "anymal"};
        String[] res = sameVowelGroup(arr);
        for (int i=0; i<res.length && res[i] != null; i++)
            System.out.println(res[i]);
    }
}