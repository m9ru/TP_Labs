public class Lab1 {
    public static void main(String[] args) {
        Thread1 thrd1 = new Thread1();
        thrd1.start();
        Thread2 thrd2 = new Thread2();
        thrd2.start();
        Thread3 thrd3 = new Thread3();
        thrd3.start();
    }
}