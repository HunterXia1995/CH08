package test15;

import java.util.Map;
import java.util.TreeMap;

public class test {


    public static void main(String[] args) {
        Map<String, String> m = new TreeMap();
        m.put("123", "124");
        Map<String, String> m1 = new TreeMap();
        m1.putAll(m);

    }
}