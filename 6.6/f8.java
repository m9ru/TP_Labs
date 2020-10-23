public class f8 {
    public static String convertToRoman(int n)
    {
        if (n > 3999 || n <= 0)
            return "Invalid";
        String res = "";
        while (n >= 1000)
        {
            n -= 1000;
            res += "M";
        }
        if (n >= 900) {
            n -= 900;
            res += "CM";
        } else
        if (n >= 500) {
            n -= 500;
            res += "D";
        } else
        if (n >= 400) {
            n -= 400;
            res += "CD";
        } else
        while (n >= 100) {
            n -= 100;
            res += "C";
        }
        if (n >= 90) {
            n -= 90;
            res += "XC";
        } else
        if (n >= 50) {
            n -= 50;
            res += "L";
        } else
        if (n >= 40) {
            n -= 40;
            res += "XL";
        } else
        while (n >= 10) {
            n -= 10;
            res += "X";
        }
        if (n == 9) {
            n -= 9;
            res += "IX";
        } else
        if (n >= 5) {
            n -= 5;
            res += "V";
        } else
        if (n == 4) {
            n -= 4;
            res += "IV";
        } else
        while (n >= 1) {
            n -= 1;
            res += "I";
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(convertToRoman(1426));
    }
}