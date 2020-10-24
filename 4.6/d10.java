public class d10 {
    public static int countUniqueBooks(String seq, char ch) {
        int beg = -1, end = -1, i, j, count = 0;
        String temp, test;
        for (i=0; i<seq.length(); i++) {
            if (seq.charAt(i) == ch) {
                if (beg == -1) {
                    beg = i;
                }
                else {
                    end = i;
                }
            }
            if (beg != -1 && end != -1) {
                test = seq.substring(beg+1, end);
                temp = "";
                for (j = 0; j < test.length(); j++){
                    if (temp.indexOf(test.charAt(j)) < 0){
                        temp = temp + test.charAt(j);
                }
                count += temp.length();
                beg = -1;
                end = -1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
    }
}