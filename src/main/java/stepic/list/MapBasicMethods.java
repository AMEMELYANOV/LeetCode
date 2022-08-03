package stepic.list;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class MapBasicMethods {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>() {
            {
                put("a", "abstraction");
                put("b", "boolean");
                put("c", "xyz");
            }
        };
        System.out.println(mapShare(map));

        String[] arr = "a b b c d a b".split(" ");
        printMap(wordCount(arr));

        NavigableMap<Integer, String> navMap = new TreeMap<>() {
            {
                put(1, "one");
                put(2, "two");
                put(3, "three");
                put(4, "four");
                put(5, "five");
                put(6, "six");
                put(7, "seven");
            }
        };

        System.out.println(getSubMap(navMap));

    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        String aValue = map.get("a");
        for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (aValue != null && entry.getKey().equals("b")) {
                entry.setValue(aValue);
            } else if (entry.getKey().equals("c")) {
                it.remove();
            }
        }
        return map;
    }

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        for (String s : strings) {
            sortedMap.merge(s, 1, Integer::sum);
        }
        return sortedMap;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.printf("%s : %d%s", key, value, System.lineSeparator()));
    }

    public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map) {
        return map.firstKey() % 2 != 0 ?
                map.subMap(map.firstKey(), true, map.firstKey() + 4, true).descendingMap()
                : map.subMap(map.lastKey() - 4, true, map.lastKey(), true).descendingMap();
    }

}
