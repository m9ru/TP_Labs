public class e10 {
    public static String hexLattice(int n) {
        String res = "";
        int c, i, j;
        //double x = 1/6.0;
        //x = 1/2*1.0+1/6*1.0*Math.sqrt(12*n-3);
        double x = 1/2.0+1/6.0*Math.sqrt(12.0*n-3); // hexagonal formula
        if (Math.ceil(x) == Math.floor(x)) { // check integer
            c = (int) x;
            for (i=0; i<c; i++) { // each string to half
                for (j=0; j<c-i; j++) // spaces before
                    res += " ";
                for (j=0; j<c+i; j++) // letters "o"
                    res += "o ";
                for (j=0; j<c-i-1; j++) // spaces after
                    res += " ";
                res += "\n"; // next string
            }
            for (i=c-2; i>=0; i--) { // each string from half+1 to end
                for (j=0; j<c-i; j++) // spaces before
                    res += " ";
                for (j=0; j<c+i; j++) // letters "o"
                    res += "o ";
                for (j=0; j<c-i-1; j++) // spaces after
                    res += " ";
                res += "\n"; // next string
            }
        }
        else
            res = "Invalid";
        return res;
    }
    public static void main(String[] args) {
        System.out.println(hexLattice(0));
    }
}