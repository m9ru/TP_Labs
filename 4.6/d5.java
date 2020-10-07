public class d5 {
    public static String BMI(String str1, String str2) {
        String s1 = "";
        double weight = Double.parseDouble(str1.substring(0, str1.indexOf(" ")));
        if (str1.endsWith("pounds")) {
            weight *= 0.453592;
        }
        double height = Double.parseDouble(str2.substring(0, str2.indexOf(" ")));
        if (str2.endsWith("inches")) {
            height *= 0.0254;
        }
        double BMI = weight*1.0/Math.pow(height, 2);
        if (BMI < 18.5) {
            s1 += String.format("%.1f", BMI) + " Underweight";
        }
        else if (BMI < 25) {
            s1 += String.format("%.1f", BMI) + " Normal weight";
        }
        else {
            s1 += String.format("%.1f", BMI) + " Overweight";
        }
        return s1;
    }
    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));
    }
}