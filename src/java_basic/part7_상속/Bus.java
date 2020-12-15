package java_basic.part7_상속;

public class Bus extends Car {
    public void horn() {
        System.out.println("빵빵");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("버스의 run 메소드");
    }
}
