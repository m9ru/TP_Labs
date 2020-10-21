public class e2 {
    public static boolean canMove(String chessman, String from, String to) {
        chessman = chessman.toLowerCase();
        from = from.toUpperCase();
        to = to.toUpperCase();
        if (from.length() == 2 && to.length() == 2 && from.charAt(0) >= 65 && from.charAt(0) <= 90 &&
            to.charAt(0) >= 65 && to.charAt(0) <= 90 && from.charAt(1) >= 49 && from.charAt(1) <= 56 &&
            to.charAt(1) >= 49 && to.charAt(1) <= 56 && from != to)
            if (chessman.equals("rook"))
                if (from.charAt(0) == to.charAt(0) || from.charAt(1) == to.charAt(1))
                    return true;
                else
                    return false;
            else if (chessman.equals("bishop"))
                if (Math.abs((int)from.charAt(0) - (int)to.charAt(0)) == Math.abs(from.charAt(1) - to.charAt(1)))
                    return true;
                else
                    return false;
            else if (chessman.equals("queen"))
                if (from.charAt(0) == to.charAt(0) || from.charAt(1) == to.charAt(1) ||
                    Math.abs((int)from.charAt(0) - (int)to.charAt(0)) == Math.abs(from.charAt(1) - to.charAt(1)))
                    return true;
                else
                    return false;
            else if (chessman.equals("king"))
                if (Math.abs((int)from.charAt(0) - (int)to.charAt(0)) <= 1 && Math.abs(from.charAt(1) - to.charAt(1)) <= 1)
                    return true;
                else
                    return false;
            else if (chessman.equals("pawn"))
                if (from.charAt(1) >= 50 && from.charAt(1) <= 55 &&
                    Math.abs(from.charAt(0) - to.charAt(0)) <= 1 && Math.abs(from.charAt(1) - to.charAt(1)) == 1 ||
                    Math.abs(from.charAt(1) - to.charAt(1)) == 2 && from.charAt(0) - to.charAt(0) == 0 &&
                    (from.charAt(1) == 50 || from.charAt(1) == 55))
                    return true;
                else
                    return false;
            else if (chessman.equals("horse"))
                if (Math.abs((int)from.charAt(0)-(int)to.charAt(0)) == 1 && Math.abs(from.charAt(1) - to.charAt(1)) == 2 ||
                    Math.abs((int)from.charAt(0)-(int)to.charAt(0)) == 2 && Math.abs(from.charAt(1) - to.charAt(1)) == 1)
                    return true;
                else
                    return false;
            else
                return false;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(canMove("horse", "c3", "a1"));
    }
}