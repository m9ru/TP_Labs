public class d3 {
    public static String toCamelCase(String s) {
        String s1 = "";
        char ch;
        int i = 0;
        while (i<s.length()) {
            ch = s.charAt(i);
            if (ch == '_') {
                i++;
                ch = Character.toUpperCase(s.charAt(i));
            }
            s1 += ch;
            i++;
        }
        return s1;
    }
    public static String toSnakeCase(String s) {
        String s1 = "";
        char ch;
        int i = 0;
        while (i<s.length()) {
            ch = s.charAt(i);
            if ((int)ch >= 65 && (int)ch <= 90) {
                s1 += '_';
                ch = Character.toLowerCase(ch);
            }
            s1 += ch;
            i++;
        }
        return s1;
    }
    public static void main(String[] args) {
        System.out.println(toCamelCase("is_modal_open"));
        System.out.println(toSnakeCase("helloEdabitBruh"));
    }
}