package first_project.part3;

public class While {
    public static void main(String[] args) {
//        int i = 0;
//
//        while(i < 10) {
//            System.out.println(i);
//            i++;
//        }
        int total = 0;
        int i = 1;
        while(i <= 100) {
            total += i;
            i++;
            System.out.println(total);
        }

        while(true) {
            System.out.println("hello");
        }
    }
}
