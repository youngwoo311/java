package java_basic.part8_인터페이스와_다른_형식의_클래스;

public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);

    default int exec(int i, int j) {
        return i + j;
    }

    public static int exec2(int i, int j) {
        return i * j;
    }
}
