package java_basic.part8_인터페이스와_다른_형식의_클래스;

public class LedExam {

    public static void main(String[] args) {
        Tv tv = new LedTv();
        tv.turnOn();
        tv.turnOff();
        tv.changeVolume(40);
        tv.changeChannel(11);

    }

}
