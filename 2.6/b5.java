public class b5 {
    public static int getDecimalPlaces(String n) {
        return n.split("\\.")[1].length();
    }
    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("23.589"));
    }
}