package itheima03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {


        ArrayList<String> array = new ArrayList<>();
        array.add("cccc");
        array.add("b");
        array.add("aa");
        array.add("dd");

        System.out.println("排序前："+array);

        Collections.sort(array,getComparator());
        System.out.println("排序后："+array);

    }

    private static Comparator<String> getComparator(){
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };
//        return comp;
        return (s1,s2)->s1.length()-s2.length();
    }
}
