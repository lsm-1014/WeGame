package itheima04;

import java.util.ArrayList;

public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
//        list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
//        list.stream().map(Integer::parseInt).forEach(System.out::println);

        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        int reaust = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(reaust);
    }
}
