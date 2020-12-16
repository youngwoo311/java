package java_basic.part8_인터페이스와_다른_형식의_클래스;

public class MyCalTest {

    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        cal.multiple(2, 5);
        int i = cal.exec(10, 20);
        System.out.println(i);

        Calculator.exec2(3,4);
    }
}
