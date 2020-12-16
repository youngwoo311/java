package java_basic.part8_인터페이스와_다른_형식의_클래스;

public class InnerExam1 {

    class Cal{
        int value = 0;
        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1();
        InnerExam1.Cal cal = t.new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
