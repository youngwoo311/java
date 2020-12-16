package java_basic.part9_에외처리;

public class BizExam {

    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.BizMethod(10);

        try {
            biz.BizMethod(-3);
        } catch(Exception e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }

    }
}
