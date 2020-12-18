package java_intermediate.part3_java.util_패키지;

public class BoxExam {

    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object());
//        Object obj = box.getObj();
//        System.out.println(obj);
//
//        box.setObj("hello");
//        String str = (String) box.getObj();
//        System.out.println(str);
//
//        box.setObj(1);
//        int value = (int) box.getObj();
//        System.out.println(value);

        Box<Object> box1 = new Box();
        box1.setObj(new Object());
        Object obj = box1.getObj();
        System.out.println(obj);

        Box<String> box2 = new Box();
        box2.setObj("hellow");
        String str = box2.getObj();
        System.out.println(str);

        Box<Integer> box3 = new Box();
        box3.setObj(12345);
        Integer value = box3.getObj();
        System.out.println(value);
    }
}
