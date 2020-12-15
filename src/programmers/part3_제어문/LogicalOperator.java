package programmers.part3_제어문;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);
        System.out.println(b1 || b3);

        int score = 88;
        if(score <= 100 && score >= 70) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
        System.out.println(b1 ^ b3);
        System.out.println(b1 ^ b2);
        System.out.println(!b1);
    }
}
