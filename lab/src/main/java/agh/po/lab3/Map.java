package agh.po.lab3;

import java.util.HashMap;

public class Map {

    public java.util.Map<String, String> mapAB(java.util.Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public java.util.Map<String, Integer> wordLen(String[] strings) {
        java.util.Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }
}