public class Thread1 extends Thread {
    private static int num;

    @Override
    public void run() {
        while (true) {
            num = (int) (Math.random()*10+1);
            System.out.println("thread1 - " + num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static int getNum() {
        return num;
    }
}