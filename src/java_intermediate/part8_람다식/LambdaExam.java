package java_intermediate.part8_람다식;

public class LambdaExam {

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i = 0; i < 10; i++) {
//                    System.out.println("hello");
//                }
//            }
//        }).start();

        new Thread(() -> {
            for(int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
        }).start();
    }
}
