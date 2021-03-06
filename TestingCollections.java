package Examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestingCollections {

    public static void main (String[] args){

        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println("AAAAAAAA");
        map.entrySet().stream().forEach(e -> System.out.println(e));
        System.out.println("AAAAAAAA");

        System.out.println("using entrySet and toString");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

        System.out.println("using entrySet and manual string creation");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println();

        System.out.println("using keySet");
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println();


    }
}
