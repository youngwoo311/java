package java_intermediate.part3_java.util_패키지;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("001", "kim");
        map.put("002", "lee");
        map.put("003", "kang");
        map.put("001", "kang");

        System.out.println(map.size());
        System.out.println(map.get("001"));

        Set<String> keys = map.keySet();
        for(String str : keys) {
            System.out.println(str);
        }

        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
