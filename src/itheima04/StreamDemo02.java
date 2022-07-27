package itheima04;

import java.util.ArrayList;

public class StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lishuman");
        list.add("zhengjun");
        list.add("jiangjingtao");
        list.add("lican");
        list.add("wangzhaojun");
        list.add("quxizhang");

        list.stream().sorted().forEach(System.out::println);
        System.out.println("--------");


//        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
        list.stream().sorted((s1,s2)->{
            int num = s1.length()-s2.length();
            int num2 = num==0?s1.compareTo(s2):num;
            return num2;
        }).forEach(System.out::println);
    }
}
