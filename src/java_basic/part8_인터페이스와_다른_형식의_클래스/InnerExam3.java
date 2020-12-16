package java_basic.part8_인터페이스와_다른_형식의_클래스;

public class InnerExam3 {

    public void exec() {
        class Cal {
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();

    }
}
