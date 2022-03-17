package lesson17Thread;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1000; i < 1010; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
