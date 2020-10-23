public class f10 {
    public static boolean palindromeDescendant(int n)
    {
        String str = Integer.toString(n), buf = "";
        while (str.length() >= 2) {
            String gg = new StringBuilder(str.substring(str.length()/2,str.length())).reverse().toString(); // reverse
            if (str.substring(0,str.length()/2).equals(gg))
                return true;
            buf = "";
            for (int i=0; i<str.length(); i+=2) 
                buf += Integer.toString(Integer.parseInt(str.substring(i,i+1)) + Integer.parseInt(str.substring(i+1,i+2)));
            str = buf;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(palindromeDescendant(12));
    }
}