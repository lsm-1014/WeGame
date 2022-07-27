package itheima05;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("胡歌");
        manList.add("彭于晏");
        manList.add("吴彦祖");
        manList.add("李易峰");
        manList.add("林更新");
        manList.add("蔡徐坤");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("李志林");
        womanList.add("林曼玉");
        womanList.add("林徽因");
        womanList.add("陆小曼");
        womanList.add("燕子");
        womanList.add("新海城");
//
        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);

        Stream<String> womanStream = womanList.stream().filter(s -> s.startsWith("林")).skip(1);

        Stream<String> stream = Stream.concat(manStream, womanStream);
//        stream.map(Actor::new).forEach(System.out::println);
        stream.map(Actor::new).forEach(p-> System.out.println(p.getName()));
//        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3),
//                womanList.stream().filter(s -> s.startsWith("林")).skip(1))
//                        .map(Actor::new).forEach(p -> System.out.println(p.getName()));


    }
}
