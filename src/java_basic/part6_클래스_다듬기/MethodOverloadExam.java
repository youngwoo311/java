package java_basic.part6_클래스_다듬기;

public class MethodOverloadExam {

    public static void main(String[] args) {
        MyClass2 m = new MyClass2();

        System.out.println(m.plus(4,5));
        System.out.println(m.plus(3, 4, 5));
        System.out.println(m.plus("hello", "world"));

    }
}
