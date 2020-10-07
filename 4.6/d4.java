public class d4 {
    public static String overTime(double begin, double end, double rate, double fact) {
        String s1 = "$";
        double overRate;
        if (end > 17) {
            overRate = (17 - begin) * rate + (end - 17) * rate * fact;
        }
        else {
            overRate = (end - begin) * rate;
        }
        s1 += String.format("%.2f",overRate);
        return s1;
    }
    public static void main(String[] args) {
        System.out.println(overTime(13.25, 15, 30, 1.5));
    }
}