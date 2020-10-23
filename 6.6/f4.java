import java.util.ArrayList;
public class f4 {
    public static String stripUrlParams (String str, String... args) {
        int i = str.indexOf("?");
        String bufPar = "", bufNum = "", res;
        if (i == -1)
            return str;
        i++;
        res = str.substring(0, i);
        Boolean boolPar = true, inArgs;
        ArrayList<String> params = new ArrayList<>(args.length);
        ArrayList<Integer> values = new ArrayList<>(args.length);
        while (i<str.length()) {
            if (str.charAt(i) == '&' && bufNum.length() > 0 && !boolPar) {
                if (params.indexOf(bufPar) != -1)
                    values.set((params.indexOf(bufPar)), Integer.parseInt(bufNum));
                boolPar = true;
                bufPar = "";
                bufNum = "";
            }
            else
                if (!boolPar)
                    bufNum += str.charAt(i);
            if (str.charAt(i) == '=' && bufPar.length() > 0 && boolPar) {
                if (params.indexOf(bufPar) == -1) {
                    inArgs = false;
                    for (String j:args)
                        if (j.equals(bufPar))
                            inArgs = true;
                    if (!inArgs) {
                        params.add(bufPar);
                        values.add(null);
                    }
                }
                boolPar = false;
            }
            else
                if (boolPar && str.charAt(i) != '&')
                    bufPar += str.charAt(i);
            i++;
        }
        if (!boolPar && bufNum.length() > 0) // for last
            if (params.indexOf(bufPar) != -1)
                values.set((params.indexOf(bufPar)), Integer.parseInt(bufNum));
        for (i=0; i<params.size(); i++) {
            res += params.get(i) + "=" + values.get(i);
            if (i<params.size() - 1)
                res += "&";
        }
        return res;

    }
    public static void main(String[] args) {
        String[] extraOpt = {"b"};
        System.out.println(stripUrlParams("https://edabit.com?a=3&c=4&a=5&a=4&b=8&c=5", extraOpt));
    }
}