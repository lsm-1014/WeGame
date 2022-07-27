package itheima04;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        Map<String,Integer> map = new HashMap<>();
        Stream<String> mapStream = map.keySet().stream();
        Stream<Integer> valuseStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        String[] strArray = {"hello","world","java"};
        Stream<String> strArrayStream1 = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);

    }
}
