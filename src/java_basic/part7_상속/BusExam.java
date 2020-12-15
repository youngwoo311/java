package java_basic.part7_상속;

public class BusExam {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.horn();

        Car c = new Bus();
        Bus bus2 = (Bus) c;
        bus2.run();
        bus2.horn();


    }
}
