package datastructure;

import java.util.*;

public class UseListHashMap {
    public static void main(String[] args) {
        List<String> stateListOfUSA = new ArrayList<>();
        stateListOfUSA.add("Uzbekistan");
        stateListOfUSA.add("Kazakhstan");
        stateListOfUSA.add("Turkmenistan");

        List<String> stateListOfRussia = new ArrayList<>();
        stateListOfRussia.add("gold");
        stateListOfRussia.add("diamond");
        stateListOfRussia.add("silver");

        List<String> cityListOfGalaxy = new ArrayList<>();
        cityListOfGalaxy.add("Los Angeles");
        cityListOfGalaxy.add("Tokyo");
        cityListOfGalaxy.add("New york");

        List<String> typesListOfCars = new ArrayList<>();
        typesListOfCars.add("Audi");
        typesListOfCars.add("BMW");
        typesListOfCars.add("WV");

        Map<String, List <String>>map = new LinkedHashMap<String, List<String>>();
        map.put("USA", stateListOfUSA);
        map.put("Russia", stateListOfRussia);
        map.put("Galaxy", cityListOfGalaxy);
        map.put("Cars", typesListOfCars);

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}