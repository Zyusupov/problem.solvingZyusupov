package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NV");
        map.put(2, "NY");
        map.put(3, "PA");

        System.out.println (map.get(2)+ " "+map.get(3)+" "+map.get(1));
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

    }
}
