package java_basic.part8_인터페이스와_다른_형식의_클래스;

public class MyCal implements Calculator{

    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int multiple(int i, int j) {
        return i * j;
    }
}
