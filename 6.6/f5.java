public class f5 {
    public static String[] getHashTags(String str) {
        String[] hash = {"", "", ""};
        String buf = "";
        int i = 0;
        while (i<str.length()) {
            if (str.charAt(i) < 65 || str.charAt(i) > 90 && str.charAt(i) < 97 || str.charAt(i) > 122 || i == str.length() - 1) {
                if (i == str.length() - 1) // for last letter
                    buf += str.charAt(i);
                buf = buf.toLowerCase();
                if (hash[0].length() < buf.length()) {
                    hash[2] = hash[1];
                    hash[1] = hash[0];
                    hash[0] = buf;
                }
                else if (hash[1].length() < buf.length()) {
                    hash[2] = hash[1];
                    hash[1] = buf;
                }
                else if (hash[2].length() < buf.length()) {
                    hash[2] = buf;
                }
                buf = "";
            }
            else
                buf += str.charAt(i);
            i++;
        }
        for (i=0; i<3; i++)
            if (hash[i] != "")
                hash[i] = "#" + hash[i];
        return hash;
    }
    public static void main(String[] args) {
        String[] arr = getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit");
        for (int i=0; i<3; i++)
            if (arr[i] != "")
                System.out.println(arr[i]);
    }
}