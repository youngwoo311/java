package part4_배열;

public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[100];

        array1[0] = 50;
        array1[10] = 100;

        int[] array2 = new int[]{1,2,3,4};
        int[] array3 = {1,2,3,4};

        System.out.println(array3[3]);
        int value = array3[0];
        System.out.println(value);

        for(int i=0; i<4; i++) {
            System.out.println(array2[i]);
        }
    }
}
