package itheima04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("狗哥");
        list.add("蒋介石");
        list.add("蒋泽东");
        list.add("邓小平");
        list.add("蒋灿");

        ArrayList<String> jianglist = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("蒋")) {
                jianglist.add(s);
            }
        }
        //System.out.println(jianglist);
        ArrayList<String> threelist = new ArrayList<>();
        for (String s : jianglist) {
            if (s.length() == 3) {
                threelist.add(s);
            }
        }
        for (String s : threelist) {
            System.out.println(s);
        }

        System.out.println("---------");
        //list.stream().filter(s -> s.startsWith("蒋")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
//        list.stream().filter(s -> s.startsWith("蒋")).filter(s -> s.length() == 3).forEach(System.out::println);
        list.stream().forEach(System.out::println);

        List<Integer> liste = new ArrayList<>();
        liste.add(213);
        liste.add(321);
        liste.add(222);
        liste.add(1);
//        liste.stream().sorted(Comparator.reverseOrder());
//        liste = liste.stream().sorted(Comparator.reverseOrder());
        liste=liste.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(liste);
    }
}
