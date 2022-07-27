package itheima04;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
//        boolean b1= checkString("hello",(String s)->{
//            return s.length()>8;
//        });

        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b2);

        boolean b3 = checkString("helloworld",s -> s.length()>8,s -> s.length()<15);
        System.out.println(b3);

        boolean b4 = checkString("hello",s -> s.length()>8,s -> s.length()<15);
        System.out.println(b4);
    }
    private static boolean checkString(String s, Predicate<String> pre1,Predicate<String>pre2) {
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        boolean b = b1&&b2;
//        return b;
//        return pre1.and(pre2).test(s);
        return pre2.or(pre2).test(s);
    }



        private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }
}
