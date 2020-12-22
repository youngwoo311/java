package java_intermediate.part7_쓰레드;

public class ThreadB extends Thread {

    int total;

    public void run() {
        synchronized (this) {
            for(int i = 0; i < 5; i++) {
                System.out.println(i + "를 더합니다.");
                total += i;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
}
