package itheima04;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("狗哥");
        array.add("张曼玉");
        array.add("隶属满");
        array.add("成正望");
        array.add("李灿");
        array.add("李元吧");

//        array.stream().limit(3).forEach(System.out::println);
//        System.out.println("--------");
//
//        array.stream().skip(3).forEach(System.out::println);
//        System.out.println("--------");
//
//        array.stream().skip(2).limit(2).forEach(System.out::println);

        Stream<String> s1 = array.stream().limit(4);

        Stream<String> s2 = array.stream().skip(2);

//        Stream.concat(s1,s2).forEach(System.out::println);
        Stream.concat(s1,s2).distinct().forEach(System.out::println);


    }
}
