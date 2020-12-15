package programmers.part3_제어문;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);

        do {
            value = scan.nextInt();
            System.out.println("입력받은 값 : " + value);
        }while(value != 10);

        System.out.println("반복문 종료!!");
    }
}
