public class e4 {
    public static int sumDigProd(int ...nums) {
        int res = 0;
        String s;
        for (int n: nums)
            res += n;
        while (Integer.toString(res).length() != 1) {
            s = Integer.toString(res);
            res = 1;
            for (int i=0; i<s.length(); i++)
                res *= Integer.parseInt(s.substring(i, i+1)); 
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));
    }
}