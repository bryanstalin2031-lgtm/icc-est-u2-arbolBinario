package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    
    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);
        System.out.println(map.size());

        System.out.println(map.values().toArray());

        for(int i = 0; i < map.size(); i++) {
            //MAP -> V -> VALORES -> ARRAY -> ARRAY[POS]
            System.out.println(map.values().toArray()[i]);
        }//50, 20, 30

        //MAP -> K -> KEYs -> SET -> valor del set

        for(String key : map.keySet()) {
            System.out.println(key);
        }// A, B, C

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }// A=50, B=20, C=30




        return map;
    }
    public LinkedHashMap<String, Integer> construirLinkedHashMap() {
        LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();
        lMap.put("A", 10);
        lMap.put("B", 20);
        lMap.put("C", 30);
        lMap.put("A", 50);
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;
    }
    public Map<String, Integer> construirTreeMap() {
        Map<String, Integer> tMap = new TreeMap<>();
        tMap.put("A", 10);
        tMap.put("B", 20);
        tMap.put("C", 30);
        tMap.put("A", 50);
        tMap.put("A", 2);
        tMap.put("B", 3);
        tMap.put("A", 5);
        tMap.put("C", 50);
        tMap.put("D", 5);
        tMap.put("F", 3);
        tMap.put("G", 8);
        tMap.put("H", 85);
        tMap.put("I", 5);
        System.out.println(tMap);
        System.out.println(tMap.entrySet());
        return tMap;
    }

}
