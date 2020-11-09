public class Thread2 extends Thread {
    private int num, numChange;

    @Override
    public void run() {
        while (true) {
            setNum(Thread1.getNum());
            if (num % 2 == 0) {
                numChange = (int)Math.pow(num, 2);
                System.out.println("thread2 - " + numChange);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void setNum(int num) {
        this.num = num;
    }
}