package itheima03;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {
    public static void main(String[] args) {
//        operatorString("狗哥",(String s)->{
//            System.out.println(s);
//        });

        operatorString("狗哥",s -> System.out.println(s));
        operatorString("狗哥",s -> System.out.println(new StringBuilder(s).reverse().toString()));


    }

    private static void operatorString(String name, Consumer<String>con){
        con.accept(name);
    }
}
