package java_intermediate.part7_쓰레드;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class DaemonThread implements Runnable {

    @Override
    public void run() {
        while(true) {
            System.out.println("데몬 쓰레드가 실행중입니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonThread());
        thread.setDaemon(true);
        thread.start();

        try {
            thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드가 종료됩니다.");
    }
}
