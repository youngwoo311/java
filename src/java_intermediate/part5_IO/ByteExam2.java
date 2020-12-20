package java_intermediate.part5_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;


        try {
            fis = new FileInputStream("src/java_intermediate/part5_IO/ByteExam1.java");
            fos = new FileOutputStream("src/java_intermediate/part5_IO/byte2.txt");


            int readCount = -1;
            byte[] buffer = new byte[512];
            while((readCount = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, readCount);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
