public class f4 {
    public static Boolean validColor(String str) {
        if ((str.substring(0, 4).equals("rgb(") || str.substring(0, 5).equals("rgba(")) &&
            str.charAt(str.length()-1) == ')' ) {
                int i = str.indexOf("(") + 1;
                String buf = "";
                int commas = 0;
                while (str.charAt(i) != ')' && commas < 4) {
                    if (str.charAt(i) >= 48 && str.charAt(i) <= 57 || commas == 3 && str.charAt(i) == '.')
                        buf += str.charAt(i);
                    else if (str.charAt(i) == ',') {
                        if (buf == "" || Integer.parseInt(buf) > 255)
                            return false;
                        buf = "";
                        commas++;
                    }
                    else
                        return false;
                    i++;
                }
                if (buf == "" || commas == 3 && Double.parseDouble(buf) > 1)
                    return false;
                if (str.substring(0, 4).equals("rgb(") && commas == 2 || str.substring(0, 5).equals("rgba(") && commas == 3)
                    return true;
                else
                    return false;
        }
        else
            return false;


    }
    public static void main(String[] args) {
        System.out.println(validColor("rgb(7,54,8)"));
    }
}