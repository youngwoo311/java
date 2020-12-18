package java_intermediate.part3_java.util_패키지;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        System.out.println(set1.size());
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        Iterator<String> iter = set1.iterator();
        while(iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
        for(String str : set1) {
            System.out.println(str);
        }
    }


}
