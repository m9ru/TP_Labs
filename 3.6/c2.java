public class c2 {
    public static int findZip(String str) {
        return str.indexOf("zip", str.indexOf("zip") + 1);
    }
    public static void main(String[] args) {
        System.out.println(findZip("all zip files are zipped"));
    }
}