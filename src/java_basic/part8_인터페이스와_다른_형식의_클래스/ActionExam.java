package java_basic.part8_인터페이스와_다른_형식의_클래스;

public class ActionExam {

    public static void main(String[] args) {
//        Action action = new MyAction();
//        action.exec();
        Action action = new Action() {
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}
