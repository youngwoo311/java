package java_intermediate.part5_IO;

import java.io.*;

public class CharIOExam02 {

    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("src/java_intermediate/part5_IO/CharIOExam02.java"));
            pw = new PrintWriter(new FileWriter("src/java_intermediate/part5_IO/test.txt"));
            String line = null;
            while((line = br.readLine()) != null) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
