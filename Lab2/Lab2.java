import java.io.FileReader;
import java.io.IOException;
public class Lab2 {
    public static void print2dArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.printf("%20s\t", arr[i][j]);
            System.out.printf("\n");
        }
    }

    public static void allImmQuant(String[][] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++)
            sum += Integer.parseInt(arr[i][1]);
        System.out.println("All immigrants quantity is " + sum);
    }

    public static void percentImm(String[][] arr) {
        double sum = 0;
        for (int i = 1; i < arr.length; i++)
            sum += Double.parseDouble(arr[i][2]);
        System.out.println("Persent of all immigrants is " + sum);
    }

    public static void percentMaxMin(String[][] arr) {
        double max = -1, min = 101;
        String maxStr = "", minStr = "";
        for (int i = 1; i < arr.length; i++)
            if (max < Double.parseDouble(arr[i][3])) {
                max = Double.parseDouble(arr[i][3]);
                maxStr = arr[i][0];
            } else if (min > Double.parseDouble(arr[i][3])) {
                min = Double.parseDouble(arr[i][3]);
                minStr = arr[i][0];
            }
        System.out.println("Maximum immigrants in " + maxStr + " (" + Double.toString(max) + "%%"
                + ")\nMinimum immigrants in " + minStr + " (" + Double.toString(min) + "%%)");
    }

    public static void population(String[][] arr) {
        System.out.println(arr[0][0] + "\tPopulation");
        for (int i = 1; i < arr.length; i++) {
            int populat = (int) (Integer.parseInt(arr[i][1]) / Double.parseDouble(arr[i][3]) * 100);
            System.out.printf("%20s\t%10d\n", arr[i][0], populat);
        }
    }

    public static String[][] read2dArr() {
        String[][] arr = new String[10][4];
        try (FileReader reader = new FileReader("Immigr.txt")) {
            int ch, i = 0, j = 0;
            while ((ch = reader.read()) != -1) {
                if (ch == 32 && j > 0) {
                    j++;
                    continue;
                } else if (ch == 10) {
                    i++;
                    j = 0;
                    continue;
                } else if (ch >= 48 && ch <= 57 && j == 0)
                    j++;
                else if (arr[i][j] == null)
                    arr[i][j] = "" + (char) ch;
                else
                    arr[i][j] += (char) ch;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }
    public static String[][] sort2dArr(String arr[][], int col)
    {
        String[][] arr2 = new String[arr.length][arr[0].length];
        double max;
        int cool = 0;
        for (int i=0; i<arr.length; i++) {
            max = -1;
            for (int j=0; j<arr.length; j++) {
                if (max<Double.parseDouble(arr[j][3])) {
                    max = Double.parseDouble(arr[j][3]);
                    cool = j;
                }
            }
            for (int k=0; k<arr[0].length; k++)
                arr2[i][k] = arr[cool][k];
            arr[cool][3] = "-1";
        }
        return arr2;
    }
    public static void main(String[] args) {
        String[][] arr = {  {"Country",             "Immigrants", "%% total", "%% population"},
                            {"United States",       "45785090", "19.8", "14.3"},
                            {"Russia",              "11048064", "4.8",  "7.7"},
                            {"Germany",             "9845244",  "4.3",  "11.9"},
                            {"Saudi Arabia",        "9060433",  "3.9",  "31.4"},
                            {"United Arab Emirates","7826981",  "3.4",  "83.7"},
                            {"United Kingdom",      "7824131",  "3.4",  "12.4"},
                            {"France",              "7439086",  "3.2",  "11.6"},
                            {"Canada",              "7284069",  "3.1",  "20.7"},
                            {"Australia",           "6468640",  "2.8",  "27.7"},
                            {"Spain",               "6466605",  "2.8",  "13.8"}};
        print2dArr(arr);
        allImmQuant(arr);
        percentImm(arr);
        percentMaxMin(arr);
        population(arr);
        String[][] arr2 = read2dArr();
        arr2 = sort2dArr(arr2, 3);
        System.out.printf("Table sorted by Population:\n\tCountry\t\t\tImmigrants\t\t\t%% total\t\t%% population\n");
        print2dArr(arr2);
    }
}