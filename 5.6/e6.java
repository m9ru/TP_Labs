public class e6 {
    public static boolean validateCard(long num) {
        String str = Long.toString(num);
        int sum = 0, temp;
        int check = Integer.parseInt(str.substring(str.length()-1,str.length()));
        str = str.substring(0, str.length()-1); // 1
        str = new StringBuilder(str).reverse().toString(); // 2
        for (int i=0; i<str.length(); i++) { // 3
            temp = Integer.parseInt(str.substring(i, i+1));
            if (i%2==0) {
                temp *= 2;
                if (temp>=10)
                    temp = temp/10 + temp%10;
            }                
            sum += temp; // 4
        }
        if (10 - sum % 10 == check) // 5
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123452L));
    }
}