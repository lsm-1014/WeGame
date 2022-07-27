package itheima02;

public class MyStringDemo {
    public static void main(String[] args) {
        useMySubString((s, x, y) -> s.substring(x,y));

        useMySubString(String::substring);
    }
    private static void useMySubString(MyString my){
        String s = my.mySubString("helloworld", 2, 5);
        System.out.println(s);
    }
}
