public class e7 {
    public static String numToEng(int num) {
        String res = "";
        String[] nums = new String[]{ "", "one", "two", "three", "four",
                                        "five", "six", "seven", "eight", "nine", 
                                        "ten", "eleven", "twelve", "thirteen", "fourteen",
                                        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] decades = new String[]{"", "", "twenty", "thirty", "forty", "fifty",
                                                "sixty", "seventy", "eighty", "ninety"};
     
        String hund = "hundred";
        if (num == 0)
            return "zero";
        if (num >= 100) {
            res += nums[num/100] + " " + hund + " ";
        }
        if (num % 100 < 20 && num % 100 != 0)
            res += nums[num % 100];
        else
            res += decades[num % 100 / 10] +  " " + nums[num % 10];
        return res;
    }
    public static void main(String[] args) {
        System.out.println(numToEng(400));
    }
}